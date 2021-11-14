package com.rickie.tracking.convertor;

import com.alibaba.cola.exception.BizException;
import com.rickie.tracking.domain.model.aggregates.TrackingActivity;
import com.rickie.tracking.dto.data.ErrorCode;
import com.rickie.tracking.gatewayimpl.TrackingActivityDO;
import org.springframework.beans.BeanUtils;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName TrackingActivityConvertor.java
 * @Description TODO
 * @createTime 2021年07月23日 14:17:00
 */
public class TrackingActivityConvertor {
    public static TrackingActivityDO toDataObject(TrackingActivity trackingActivity) {
        TrackingActivityDO trackingActivityDO = new TrackingActivityDO();
        BeanUtils.copyProperties(trackingActivity, trackingActivityDO);
        trackingActivityDO.setTrackingNumber(trackingActivity.getTrackNumber());
        return trackingActivityDO;
    }

    public static TrackingActivity toDomainObject(TrackingActivityDO trackingActivityDO) {
        if(trackingActivityDO == null){
            throw new BizException(ErrorCode.BOOKINGID_NOT_EXIST.getErrCode(), ErrorCode.BOOKINGID_NOT_EXIST.getErrDesc());
        }
        TrackingActivity trackingActivity = new TrackingActivity();
        BeanUtils.copyProperties(trackingActivityDO, trackingActivity);
        trackingActivity.setTrackNumber(trackingActivityDO.getTrackingNumber());
        return trackingActivity;
    }
}
