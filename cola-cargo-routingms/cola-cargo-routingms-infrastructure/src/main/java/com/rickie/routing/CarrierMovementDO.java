package com.rickie.routing;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CarrierMovementDO.java
 * @Description TODO
 * @createTime 2021年07月09日 19:19:00
 */
@Data
public class CarrierMovementDO {
    private Long id;
    private Date arrivalDate;
    private Date departureDate;
    private String arrivalLocation;
    private String departureLocation;
}
