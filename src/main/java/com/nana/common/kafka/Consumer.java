package com.nana.common.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Consumer {
    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "TOPIC", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info("#### -> Consumed message -> ####"+ message);
    }
}
