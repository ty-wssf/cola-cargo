package com.rickie.dto.data;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CarrierMovementDTO.java
 * @Description TODO
 * @createTime 2021年07月10日 18:43:00
 */
@Data
public class CarrierMovementDTO {
    private Long id;
    private Date arrivalDate;
    private Date departureDate;
    private String arrivalLocation;
    private String departureLocation;
}
