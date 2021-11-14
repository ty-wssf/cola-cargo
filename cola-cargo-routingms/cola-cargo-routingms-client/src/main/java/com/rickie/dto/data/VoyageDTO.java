package com.rickie.dto.data;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName VoyageDTO.java
 * @Description TODO
 * @createTime 2021年07月08日 21:06:00
 */
@Data
public class VoyageDTO {
    private Long id;
    private String voyageNumber;
    private List<CarrierMovementDTO> carrierMovements = Collections.emptyList();
}
