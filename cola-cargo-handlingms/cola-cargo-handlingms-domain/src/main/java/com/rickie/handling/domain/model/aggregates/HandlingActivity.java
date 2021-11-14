package com.rickie.handling.domain.model.aggregates;

import com.rickie.handling.domain.model.valueobjects.EventType;
import lombok.*;

import java.util.Date;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName HandlingActivity.java
 * @Description TODO
 * @createTime 2021年07月24日 23:25:00
 */
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class HandlingActivity {
    private Long id;
    @NonNull
    private EventType eventType;
    private String voyageNumber;
    @NonNull
    private String location;
    @NonNull
    private Date completionTime;
    @NonNull
    private String cargoBookingId;
}
