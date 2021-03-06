package com.rickie.domain.model.valueobjects;

import java.util.Collections;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName CargoItinerary.java
 * @Description 分配给货物的行程
 * @createTime 2021年06月13日 16:46:00
 */
public class CargoItinerary {
    public static final CargoItinerary EMPTY_ITINERARY = new CargoItinerary();

    // 行程段
    private List<Leg> legs = Collections.emptyList();

    public CargoItinerary() {
        // Nothing to initialize.
    }

    public CargoItinerary(List<Leg> legs) {
        this.legs = legs;
    }

    public List<Leg> getLegs() {
        return Collections.unmodifiableList(legs);
    }
}
