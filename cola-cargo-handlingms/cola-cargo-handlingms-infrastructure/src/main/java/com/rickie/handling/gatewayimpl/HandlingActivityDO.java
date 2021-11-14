package com.rickie.handling.gatewayimpl;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName handling_activity
 */
public class HandlingActivityDO implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Date eventCompletionTime;

    /**
     * 
     */
    private String eventType;

    /**
     * 
     */
    private String bookingId;

    /**
     * 
     */
    private String voyageNumber;

    /**
     * 
     */
    private String location;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public Date getEventCompletionTime() {
        return eventCompletionTime;
    }

    /**
     * 
     */
    public void setEventCompletionTime(Date eventCompletionTime) {
        this.eventCompletionTime = eventCompletionTime;
    }

    /**
     * 
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * 
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * 
     */
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    /**
     * 
     */
    public String getVoyageNumber() {
        return voyageNumber;
    }

    /**
     * 
     */
    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }

    /**
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     */
    public void setLocation(String location) {
        this.location = location;
    }
}