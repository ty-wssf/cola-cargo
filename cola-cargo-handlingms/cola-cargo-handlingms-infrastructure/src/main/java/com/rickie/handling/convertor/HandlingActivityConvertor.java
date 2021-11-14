package com.rickie.handling.convertor;

import com.rickie.handling.domain.model.aggregates.HandlingActivity;
import com.rickie.handling.dto.event.CargoHandledEvent;
import com.rickie.handling.gatewayimpl.HandlingActivityDO;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingActivityConvertor.java
 * @Description TODO
 * @createTime 2021年08月10日 11:27:00
 */
public class HandlingActivityConvertor {
    public static HandlingActivityDO toDataObject(HandlingActivity handlingActivity){
        HandlingActivityDO handlingActivityDO = new HandlingActivityDO();
        handlingActivityDO.setBookingId(handlingActivity.getCargoBookingId());
        handlingActivityDO.setEventCompletionTime(handlingActivity.getCompletionTime());
        handlingActivityDO.setEventType(handlingActivity.getEventType().toString());
        handlingActivityDO.setLocation(handlingActivity.getLocation());
        handlingActivityDO.setVoyageNumber(handlingActivity.getVoyageNumber());
        return handlingActivityDO;
    }

    public static CargoHandledEvent toCargoHandledEvent(HandlingActivity handlingActivity){
        CargoHandledEvent event = new CargoHandledEvent();
        event.setBookingId(handlingActivity.getCargoBookingId());
        event.setEventType(handlingActivity.getEventType().toString());
        event.setHandlingCompletionTime(handlingActivity.getCompletionTime());
        event.setHandlingLocation(handlingActivity.getLocation());
        event.setVoyageNumber(handlingActivity.getVoyageNumber());
        return event;
    }
}
