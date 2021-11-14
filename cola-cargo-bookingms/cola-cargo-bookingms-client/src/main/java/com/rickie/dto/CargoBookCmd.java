package com.rickie.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName BookCargoCommand.java
 * @Description 货物预定命令
 * @createTime 2021年06月14日 00:46:00
 */
@Data
public class CargoBookCmd {
    // 预定id
    private String bookingId;
    // 预定数量
    private int bookingAmount;
    // 始发地
    private String originLocation;
    // 目的地
    private String destLocation;
    // 目的地预期达到期限
    private Date destArrivalDeadline;
}
