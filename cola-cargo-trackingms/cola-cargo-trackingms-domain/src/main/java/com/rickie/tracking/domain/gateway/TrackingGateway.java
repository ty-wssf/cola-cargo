package com.rickie.tracking.domain.gateway;

import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingGateway.java
 * @Description TODO
 * @createTime 2021年07月22日 21:24:00
 */
public interface TrackingGateway {
    void save(TrackingActivity trackingActivity);
    TrackingActivity findByBookingId(String bookingId);

    void saveHandlingEvent(TrackingEvent trackingEvent);
}
