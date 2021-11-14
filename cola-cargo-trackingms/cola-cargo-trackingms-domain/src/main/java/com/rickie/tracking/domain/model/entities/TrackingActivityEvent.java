package com.rickie.tracking.domain.model.entities;

import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingActivityEvent.java
 * @Description TODO
 * @createTime 2021年07月17日 18:52:00
 */
@Data
public class TrackingActivityEvent {
    // 空活动
    public static final TrackingActivityEvent EMPTY_ACTIVITY = new TrackingActivityEvent();
    private List<TrackingEvent> trackingEvents = new ArrayList<>();
}

