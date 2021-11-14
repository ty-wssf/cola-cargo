package com.rickie.handling.gatewayimpl;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.rickie.handling.gatewayimpl.HandlingActivity
 */
@Mapper
public interface HandlingActivityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(HandlingActivityDO record);

    int insertSelective(HandlingActivityDO record);

    HandlingActivityDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HandlingActivityDO record);

    int updateByPrimaryKey(HandlingActivityDO record);

}
