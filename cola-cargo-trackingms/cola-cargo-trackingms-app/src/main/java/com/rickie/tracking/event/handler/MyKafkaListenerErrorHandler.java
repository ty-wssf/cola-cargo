package com.rickie.tracking.event.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName MyKafkaListenerErrorHandler.java
 * @Description TODO
 * @createTime 2021年07月19日 10:59:00
 */
@Component
public class MyKafkaListenerErrorHandler implements KafkaListenerErrorHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyKafkaListenerErrorHandler.class);

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        LOGGER.error("消息：" + message.toString() + "\n" + "异常：" + exception.getMessage());
        return null;
    }
}
