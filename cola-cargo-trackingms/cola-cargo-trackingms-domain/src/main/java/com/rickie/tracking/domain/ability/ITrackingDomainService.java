package com.rickie.tracking.domain.ability;

import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import com.rickie.tracking.dto.TrackingEventAddCmd;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ITrackingActivityService.java
 * @Description TODO
 * @createTime 2021年07月22日 21:08:00
 */
public interface ITrackingDomainService {
    void create(TrackingActivity trackingActivity);
    void addTrackingEvent(TrackingEvent trackingEvent);
}
