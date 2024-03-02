package com.stream.configurations;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaEventStreamConfiguration {

    @Bean
    public NewTopic wikimediaStreamsConsumerTopic() {
        return TopicBuilder.name("wikimedia_eventStream_topic").build();
    }
}
