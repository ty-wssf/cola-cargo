package com.rickie.domain.model.valueobjects;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CarrierMovement.java
 * @Description TODO
 * @createTime 2021年07月10日 17:39:00
 */
@Data
public class CarrierMovement {
    private Long id;
    @JSONField(format="yyyy-MM-dd")
    private Date arrivalDate;
    @JSONField(format="yyyy-MM-dd")
    private Date departureDate;
    private String arrivalLocation;
    private String departureLocation;
}