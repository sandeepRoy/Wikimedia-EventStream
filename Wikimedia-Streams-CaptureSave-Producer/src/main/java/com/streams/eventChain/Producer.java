package com.streams.eventChain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Producer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void publishEvents(String event) {
        // log.info(String.format("Sending Event : %s, To Topic : wikimedia_eventStream_topic"));
        kafkaTemplate.send("wikimedia_eventStream_topic", event);
    }
}
