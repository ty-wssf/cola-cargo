package com.rickie.tracking.gatewayimpl;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tracking_handling_events
 */
@Data
public class TrackingHandlingEventsDO implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer trackingId;

    /**
     * 
     */
    private String eventType;

    /**
     * 
     */
    private Date eventTime;

    /**
     * 
     */
    private String locationId;

    /**
     * 
     */
    private String voyageNumber;

    private static final long serialVersionUID = 1L;
}