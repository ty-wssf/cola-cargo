package com.rickie.tracking.event.handler;

import com.alibaba.cola.dto.Response;
import com.rickie.handling.dto.event.CargoHandledEvent;
import com.rickie.tracking.api.ITrackingService;
import com.rickie.tracking.assembler.TrackingCommandAssembler;
import com.rickie.tracking.dto.event.DomainEventConstant;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoHandledEventHandler.java
 * @Description TODO
 * @createTime 2021年08月12日 18:51:00
 */
@Service
public class CargoHandledEventHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargoHandledEventHandler.class);

    @Autowired
    private ITrackingService trackingService;

    @KafkaListener(topics = DomainEventConstant.CARTO_HANDLED_EVENT_TOPIC, errorHandler = "myKafkaListenerErrorHandler")
    public void receiveEvent(ConsumerRecord<String, Object> consumerRecord) {
        CargoHandledEvent handledEvent = (CargoHandledEvent)consumerRecord.value();
        LOGGER.info("Received key='{}', message='{}'", consumerRecord.key(), consumerRecord.value());
        // 调用app服务，处理领域事件
        Response response = trackingService.addTrackingEvent(
                TrackingCommandAssembler.toCommandFromEvent(handledEvent)
        );
        LOGGER.info(response.toString());
    }
}
