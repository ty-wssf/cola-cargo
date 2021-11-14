package com.rickie.dto.event;

import lombok.Getter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName DomainEvent.java
 * @Description TODO
 * @createTime 2021年07月14日 13:25:00
 */
@Getter
public abstract class DomainEvent implements Serializable {
    private final String id;
    private final Date createTime;

    public DomainEvent() {
        this.id = UUID.randomUUID().toString();
        this.createTime = new Date();
    }
}
