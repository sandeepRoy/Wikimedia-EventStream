package com.streams.eventChain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class Consumer {
    private final WebClient wikimediaEventStreamClient;
    private final Producer producer;

    public Consumer(WebClient.Builder webclientBuilder, Producer producer) {
        this.wikimediaEventStreamClient = webclientBuilder
                .baseUrl("https://stream.wikimedia.org/v2/")
                .build();
        this.producer = producer;
    }

    public void consumeEventAndPublish() {
        wikimediaEventStreamClient
                .get()
                .uri("/stream/recentchange")
                .retrieve()
                .bodyToFlux(String.class)
                .subscribe(producer::publishEvents);
    }
}
