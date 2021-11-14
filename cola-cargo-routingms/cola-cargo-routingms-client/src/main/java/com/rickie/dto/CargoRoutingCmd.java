package com.rickie.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoRoutingCmd.java
 * @Description TODO
 * @createTime 2021年07月08日 21:21:00
 */
@Data
public class CargoRoutingCmd {
    private String origin;
    private String destination;
    @JSONField(format = "yyyy-MM-dd")
    private Date deadline;
}
