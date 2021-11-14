package com.rickie.tracking.domain.model.aggregates;

import com.rickie.tracking.domain.model.entities.TrackingActivityEvent;
import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import com.rickie.tracking.dto.TrackingEventAddCmd;
import com.rickie.tracking.dto.TrackingNumberAssignCmd;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingActivity.java
 * @Description TODO
 * @createTime 2021年07月17日 18:50:00
 */
@Data
@NoArgsConstructor
public class TrackingActivity {
    private int id;
    private String trackNumber;
    private String bookingId;
    private TrackingActivityEvent trackingActivityEvent;

    public TrackingActivity(TrackingNumberAssignCmd cmd) {
        this.trackNumber = cmd.getTrackingNumber();
        this.bookingId = cmd.getBookingId();
        this.trackingActivityEvent= TrackingActivityEvent.EMPTY_ACTIVITY;
    }

    public void addTrackingEvent(TrackingEventAddCmd cmd) {
        TrackingEvent trackingEvent = new TrackingEvent(
                this.id,
                cmd.getVoyageNumber(),
                cmd.getLocation(),
                cmd.getEventType(),
                cmd.getEventTime()
        );
        this.trackingActivityEvent.getTrackingEvents().add(trackingEvent);
    }
}
