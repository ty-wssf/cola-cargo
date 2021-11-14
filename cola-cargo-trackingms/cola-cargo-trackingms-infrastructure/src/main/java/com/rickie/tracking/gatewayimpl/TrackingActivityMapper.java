package com.rickie.tracking.gatewayimpl;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.rickie.tracking.gatewayimpl.TrackingActivity
 */
@Mapper
public interface TrackingActivityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TrackingActivityDO record);

    int insertSelective(TrackingActivityDO record);

    TrackingActivityDO selectByPrimaryKey(Long id);

    TrackingActivityDO selectByBookingId(String bookingId);

    int updateByPrimaryKeySelective(TrackingActivityDO record);

    int updateByPrimaryKey(TrackingActivityDO record);

}
