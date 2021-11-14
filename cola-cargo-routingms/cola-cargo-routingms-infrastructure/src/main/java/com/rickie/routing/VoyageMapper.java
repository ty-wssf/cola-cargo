package com.rickie.routing;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName VoyageMapper.java
 * @Description TODO
 * @createTime 2021年07月09日 15:40:00
 */
@Mapper
public interface VoyageMapper {
    List<VoyageDO> findAll();
}
