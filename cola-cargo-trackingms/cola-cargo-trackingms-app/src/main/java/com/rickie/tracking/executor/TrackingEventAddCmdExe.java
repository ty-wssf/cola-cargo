package com.rickie.tracking.executor;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.exception.BizException;
import com.rickie.tracking.domain.ability.ITrackingDomainService;
import com.rickie.tracking.domain.gateway.TrackingGateway;
import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.domain.model.valueobjects.TrackingEvent;
import com.rickie.tracking.dto.TrackingEventAddCmd;
import com.rickie.tracking.dto.data.ErrorCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingEventAddCmdExe.java
 * @Description TODO
 * @createTime 2021年08月12日 19:04:00
 */
@Component
public class TrackingEventAddCmdExe {
    @Autowired
    private ITrackingDomainService trackingDomainService;
    @Autowired
    private TrackingGateway trackingGateway;

    public Response execute(TrackingEventAddCmd cmd) {
        String bookingId = cmd.getBookingId();
        // 构建聚合根对象
        TrackingActivity trackingActivity = trackingGateway.findByBookingId(bookingId);
        if(trackingActivity == null) {
            throw new BizException(ErrorCode.BOOKINGID_NOT_EXIST.getErrCode(), ErrorCode.BOOKINGID_NOT_EXIST.getErrDesc());
        }
        // 构建跟踪事件
        TrackingEvent trackingEvent = new TrackingEvent(
                trackingActivity.getId(),
                cmd.getVoyageNumber(),
                cmd.getLocation(),
                cmd.getEventType(),
                cmd.getEventTime()
        );
        // 调用领域服务
        trackingDomainService.addTrackingEvent(trackingEvent);
        return Response.buildSuccess();
    }
}
