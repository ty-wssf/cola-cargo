package com.rickie.tracking.domain.ability.impl;

import com.rickie.tracking.domain.gateway.TrackingGateway;
import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.domain.ability.ITrackingDomainService;
import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import com.rickie.tracking.dto.TrackingEventAddCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingActivityService.java
 * @Description TODO
 * @createTime 2021年07月22日 21:14:00
 */
@Service
public class TrackingDomainService implements ITrackingDomainService {
    @Autowired
    private TrackingGateway trackingGateway;

    @Override
    public void create(TrackingActivity trackingActivity) {
        // 分配tracking number
        String random = UUID.randomUUID().toString().toUpperCase();
        String trackingNumber = random.substring(0, random.indexOf("-"));
        trackingActivity.setTrackNumber(trackingNumber);
        // 持久化
        trackingGateway.save(trackingActivity);
    }

    @Override
    public void addTrackingEvent(TrackingEvent trackingEvent) {
        // 持久化
        trackingGateway.saveHandlingEvent(trackingEvent);
    }
}
