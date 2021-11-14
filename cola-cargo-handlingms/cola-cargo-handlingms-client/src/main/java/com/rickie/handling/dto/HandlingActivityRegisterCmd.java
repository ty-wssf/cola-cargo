package com.rickie.handling.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingActivityRegistrationCommand.java
 * @Description TODO
 * @createTime 2021年07月25日 21:41:00
 */
@Data
public class HandlingActivityRegisterCmd {
    private Date completionTime;
    private String bookingId;
    private String voyageNumber;
    private String location;
    private String handlingType;
}
