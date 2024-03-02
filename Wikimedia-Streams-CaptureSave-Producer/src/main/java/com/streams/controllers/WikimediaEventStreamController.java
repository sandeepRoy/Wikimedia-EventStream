package com.streams.controllers;

import com.streams.eventChain.Consumer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaEventStreamController {
    private final Consumer consumer;

    @GetMapping("/publish")
    public ResponseEntity<String> startPublishing() {
        consumer.consumeEventAndPublish();
        return new ResponseEntity<>("Publishing", HttpStatus.OK);
    }
}
