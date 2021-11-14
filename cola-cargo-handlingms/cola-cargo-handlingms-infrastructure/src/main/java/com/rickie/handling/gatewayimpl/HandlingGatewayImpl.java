package com.rickie.handling.gatewayimpl;

import com.rickie.handling.convertor.HandlingActivityConvertor;
import com.rickie.handling.domain.gateway.HandlingGateway;
import com.rickie.handling.domain.model.aggregates.HandlingActivity;
import com.rickie.handling.dto.event.CargoHandledEvent;
import com.rickie.handling.dto.event.DomainEventConstant;
import com.rickie.handling.event.DomainEventPublisher;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingGatewayImpl.java
 * @Description TODO
 * @createTime 2021年08月09日 19:15:00
 */
@Repository
public class HandlingGatewayImpl implements HandlingGateway {
    @Resource
    private HandlingActivityMapper handlingActivityMapper;
    @Resource
    private DomainEventPublisher domainEventPublisher;

    @Override
    public void save(HandlingActivity handlingActivity) {
        HandlingActivityDO handlingActivityDO = HandlingActivityConvertor.toDataObject(handlingActivity);
        handlingActivityMapper.insert(handlingActivityDO);

        //发布CargoHandledEvent 领域事件
        CargoHandledEvent cargoHandledEvent = HandlingActivityConvertor.toCargoHandledEvent(handlingActivity);
        domainEventPublisher.publish(DomainEventConstant.CARGO_HANDLED_EVENT_TOPIC, cargoHandledEvent);
    }
}
