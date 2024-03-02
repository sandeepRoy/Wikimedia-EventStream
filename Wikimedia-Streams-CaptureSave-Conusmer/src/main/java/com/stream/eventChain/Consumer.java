package com.stream.eventChain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

    @KafkaListener(topics = "wikimedia_eventStream_topic", groupId = "event-wikimedia")
    public void consumeEvents(String event) {
        log.info(String.format("Consuming Event : %s , From Topic : wikimedia_eventStream_topic", event));

        // Save data
    }
}
