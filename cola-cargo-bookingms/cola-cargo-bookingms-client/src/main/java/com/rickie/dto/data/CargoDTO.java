package com.rickie.dto.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoDTO.java
 * @Description TODO
 * @createTime 2021年06月19日 18:13:00
 */
@Data
public class CargoDTO {
    private int bookingAmount;
    private String originLocation;
    private String destLocation;
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")
    private Date destArrivalDeadline;
}
