package com.rickie.tracking.domain.model.valueobjects;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingEvent.java
 * @Description TODO
 * @createTime 2021年07月17日 19:03:00
 */
@Data
public class TrackingEvent {
    private int id;
    private int trackingId;
    private String trackingVoyageNumber;
    private String trackingLocation;
    private String trackingEventType;
    private Date eventTime;

    public TrackingEvent(int trackingId,
                         String trackingVoyageNumber,
                         String trackingLocation,
                         String trackingEventType,
                         Date eventTime
                         ) {
        this.trackingId = trackingId;
        this.trackingVoyageNumber = trackingVoyageNumber;
        this.trackingLocation = trackingLocation;
        this.trackingEventType = trackingEventType;
        this.eventTime = eventTime;
    }
}
