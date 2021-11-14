package com.rickie.tracking.gatewayimpl;

import com.rickie.tracking.convertor.TrackingActivityConvertor;
import com.rickie.tracking.convertor.TrackingHandlingEventConvert;
import com.rickie.tracking.domain.gateway.TrackingGateway;
import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.domain.model.entities.TrackingActivityEvent;
import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingGatewayImpl.java
 * @Description TODO
 * @createTime 2021年07月22日 21:26:00
 */
@Repository
public class TrackingGatewayImpl implements TrackingGateway {
    @Resource
    private TrackingActivityMapper trackingActivityMapper;
    @Resource
    private TrackingHandlingEventsMapper trackingHandlingEventsMapper;

    @Override
    public void save(TrackingActivity trackingActivity) {
        TrackingActivityDO trackingActivityDO = TrackingActivityConvertor.toDataObject(trackingActivity);
        trackingActivityMapper.insert(trackingActivityDO);
    }

    @Override
    public TrackingActivity findByBookingId(String bookingId) {
       TrackingActivityDO trackingActivityDO = trackingActivityMapper.selectByBookingId(bookingId);
       return TrackingActivityConvertor.toDomainObject(trackingActivityDO);
    }

    @Override
    public void saveHandlingEvent(TrackingEvent trackingEvent) {
        TrackingHandlingEventsDO eventsDO = TrackingHandlingEventConvert.toDataObject(trackingEvent);
        trackingHandlingEventsMapper.insert(eventsDO);
    }
}
