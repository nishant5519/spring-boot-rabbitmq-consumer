package com.burhan.consumer.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsumeMessageService {

    public void consumeMessage(String messageBody) {
        log.info("Consumed Message: " + messageBody);
    }
}
