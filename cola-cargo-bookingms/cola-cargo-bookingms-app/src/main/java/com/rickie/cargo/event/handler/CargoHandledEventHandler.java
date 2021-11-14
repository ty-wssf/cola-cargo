package com.rickie.cargo.event.handler;

import com.alibaba.cola.dto.Response;
import com.rickie.api.ICargoBookingService;
import com.rickie.cargo.convertor.CargoDTOConvertor;
import com.rickie.dto.HandlingActivityUpdateCmd;
import com.rickie.dto.event.DomainEventConstant;
import com.rickie.handling.dto.event.CargoHandledEvent;
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
 * @createTime 2021年08月13日 13:59:00
 */
@Service
public class CargoHandledEventHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(CargoHandledEventHandler.class);

    @Autowired
    private ICargoBookingService cargoBookingService;

    @KafkaListener(topics= DomainEventConstant.CARTO_HANDLED_EVENT_TOPIC, groupId = "GROUP-BOOKINGMS")
    public void receiveEvent(ConsumerRecord<String, Object> consumerRecord) {
        CargoHandledEvent handledEvent = (CargoHandledEvent)consumerRecord.value();
        LOGGER.info("Received key='{}', message='{}'", consumerRecord.key(), consumerRecord.value());
        // 调用app服务，处理领域事件
        HandlingActivityUpdateCmd cmd = CargoDTOConvertor.toHandlingActivityUpdateCmd(handledEvent);
        Response response = cargoBookingService.updateByCargoHandledEvent(cmd);
        LOGGER.info(response.toString());
    }
}
