package com.rickie.domain.model.valueobjects;

import lombok.Data;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName Leg.java
 * @Description TODO
 * @createTime 2021年06月13日 16:47:00
 */
@Data
public class Leg {
    private Long id;
    private String voyageNumber;
    private String loadLocation;
    private String unloadLocation;
    private Date loadTime;
    private Date unloadTime;

    public Leg(String voyageNumber, String loadLocation, String unloadLocation,
               Date loadTime, Date unloadTime){
        this.voyageNumber = voyageNumber;
        this.loadLocation = loadLocation;
        this.unloadLocation = unloadLocation;
        this.loadTime = loadTime;
        this.unloadTime = unloadTime;
    }
}
