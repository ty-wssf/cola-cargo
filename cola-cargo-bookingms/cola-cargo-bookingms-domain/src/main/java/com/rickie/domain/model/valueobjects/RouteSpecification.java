package com.rickie.domain.model.valueobjects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName RouteSpecification.java
 * @Description 货物路线说明
 * @createTime 2021年06月13日 16:42:00
 */
@Getter
public class RouteSpecification {
    // 始发地
    private String origin;
    // 目的地
    private String destination;
    // 目的地预期达到期限
    private Date arrivalDeadline;

    public RouteSpecification() {
    }

    /**
     * @param origin          origin location - can't be the same as the destination
     * @param destination     destination location - can't be the same as the origin
     * @param arrivalDeadline arrival deadline
     */
    public RouteSpecification(String origin, String destination,
                              Date arrivalDeadline) {
        this.origin = origin;
        this.destination = destination;
        this.arrivalDeadline = (Date) arrivalDeadline.clone();
    }
}
