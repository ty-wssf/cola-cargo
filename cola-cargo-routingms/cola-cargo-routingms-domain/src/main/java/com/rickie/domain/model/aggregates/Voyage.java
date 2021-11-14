package com.rickie.domain.model.aggregates;

import lombok.Data;
import com.rickie.domain.model.valueobjects.*;
import java.util.Collections;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName Voyage.java
 * @Description TODO
 * @createTime 2021年07月08日 15:09:00
 */
@Data
public class Voyage {
    private Long id;
    private String voyageNumber;
    private List<CarrierMovement> carrierMovements = Collections.emptyList();
}
