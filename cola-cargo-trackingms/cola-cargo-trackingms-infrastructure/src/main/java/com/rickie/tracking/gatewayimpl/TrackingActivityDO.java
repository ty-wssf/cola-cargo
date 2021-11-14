package com.rickie.tracking.gatewayimpl;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tracking_activity
 */
@Data
public class TrackingActivityDO implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String trackingNumber;

    /**
     * 
     */
    private String bookingId;

    private static final long serialVersionUID = 1L;
}