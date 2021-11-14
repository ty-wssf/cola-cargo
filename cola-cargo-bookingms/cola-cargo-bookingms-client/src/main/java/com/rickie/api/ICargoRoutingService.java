package com.rickie.api;

import com.alibaba.cola.dto.SingleResponse;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName ICargoRoutingService.java
 * @Description TODO
 * @createTime 2021年07月11日 14:46:00
 */
public interface ICargoRoutingService {
    SingleResponse<String> routeCargo(String bookingId);
}
