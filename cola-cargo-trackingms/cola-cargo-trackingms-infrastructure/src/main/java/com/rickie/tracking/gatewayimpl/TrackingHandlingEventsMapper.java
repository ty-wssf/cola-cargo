package com.rickie.tracking.gatewayimpl;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.rickie.tracking.gatewayimpl.TrackingHandlingEvents
 */
@Mapper
public interface TrackingHandlingEventsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TrackingHandlingEventsDO record);

    int insertSelective(TrackingHandlingEventsDO record);

    TrackingHandlingEventsDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrackingHandlingEventsDO record);

    int updateByPrimaryKey(TrackingHandlingEventsDO record);

}
