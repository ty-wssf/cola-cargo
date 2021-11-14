package com.rickie.tracking.convertor;

import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import com.rickie.tracking.gatewayimpl.TrackingHandlingEventsDO;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingHandlingEventConvert.java
 * @Description TODO
 * @createTime 2021年08月12日 20:30:00
 */
public class TrackingHandlingEventConvert {
    public static TrackingHandlingEventsDO toDataObject(TrackingEvent trackingEvent) {
        TrackingHandlingEventsDO eventsDO = new TrackingHandlingEventsDO();
        eventsDO.setTrackingId(trackingEvent.getTrackingId());
        eventsDO.setEventTime(trackingEvent.getEventTime());
        eventsDO.setEventType(trackingEvent.getTrackingEventType());
        eventsDO.setLocationId(trackingEvent.getTrackingLocation());
        eventsDO.setVoyageNumber(trackingEvent.getTrackingVoyageNumber());
        return eventsDO;
    }
}
