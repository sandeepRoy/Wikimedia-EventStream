package com.streams.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WikimediaEventStreamClientConfiguration {
    @Bean
    public WebClient.Builder wikimediaEventStreamClient() {
        return WebClient.builder();
    }
}
