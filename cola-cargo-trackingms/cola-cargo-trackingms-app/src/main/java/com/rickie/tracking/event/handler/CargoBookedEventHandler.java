package com.rickie.tracking.event.handler;

import com.rickie.dto.event.CargoBookedEvent;
import com.rickie.tracking.dto.event.DomainEventConstant;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoBookedEventHandler.java
 * @Description TODO
 * @createTime 2021年07月18日 20:37:00
 */
@Service
public class CargoBookedEventHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargoBookedEventHandler.class);

    @KafkaListener(topics = DomainEventConstant.CARGO_BOOKED_EVENT_TOPIC, errorHandler = "myKafkaListenerErrorHandler")
    public void receiveEvent(ConsumerRecord<String, Object> consumerRecord) {
        CargoBookedEvent routedEvent = (CargoBookedEvent)consumerRecord.value();
        LOGGER.info("Received key='{}', message='{}'", consumerRecord.key(), consumerRecord.value());
    }
}
