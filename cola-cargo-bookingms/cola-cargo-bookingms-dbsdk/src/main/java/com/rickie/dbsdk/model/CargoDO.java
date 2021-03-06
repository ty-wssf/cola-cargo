package com.rickie.dbsdk.model;

import java.io.Serializable;
import java.util.Date;

public class CargoDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.BOOKING_ID
     *
     * @mbg.generated
     */
    private String bookingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.TRANSPORT_STATUS
     *
     * @mbg.generated
     */
    private String transportStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.ROUTING_STATUS
     *
     * @mbg.generated
     */
    private String routingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.spec_origin_id
     *
     * @mbg.generated
     */
    private String specOriginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.spec_destination_id
     *
     * @mbg.generated
     */
    private String specDestinationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.SPEC_ARRIVAL_DEADLINE
     *
     * @mbg.generated
     */
    private Date specArrivalDeadline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.origin_id
     *
     * @mbg.generated
     */
    private String originId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.BOOKING_AMOUNT
     *
     * @mbg.generated
     */
    private Integer bookingAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.handling_event_id
     *
     * @mbg.generated
     */
    private Integer handlingEventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.next_expected_location_id
     *
     * @mbg.generated
     */
    private String nextExpectedLocationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.next_expected_handling_event_type
     *
     * @mbg.generated
     */
    private String nextExpectedHandlingEventType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.next_expected_voyage_id
     *
     * @mbg.generated
     */
    private String nextExpectedVoyageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.last_known_location_id
     *
     * @mbg.generated
     */
    private String lastKnownLocationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.current_voyage_number
     *
     * @mbg.generated
     */
    private String currentVoyageNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.last_handling_event_id
     *
     * @mbg.generated
     */
    private Integer lastHandlingEventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.last_handling_event_type
     *
     * @mbg.generated
     */
    private String lastHandlingEventType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.last_handling_event_location
     *
     * @mbg.generated
     */
    private String lastHandlingEventLocation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cargo.last_handling_event_voyage
     *
     * @mbg.generated
     */
    private String lastHandlingEventVoyage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cargo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    public CargoDO(Integer id, String bookingId, String transportStatus, String routingStatus, String specOriginId, String specDestinationId, Date specArrivalDeadline, String originId, Integer bookingAmount, Integer handlingEventId, String nextExpectedLocationId, String nextExpectedHandlingEventType, String nextExpectedVoyageId, String lastKnownLocationId, String currentVoyageNumber, Integer lastHandlingEventId, String lastHandlingEventType, String lastHandlingEventLocation, String lastHandlingEventVoyage) {
        this.id = id;
        this.bookingId = bookingId;
        this.transportStatus = transportStatus;
        this.routingStatus = routingStatus;
        this.specOriginId = specOriginId;
        this.specDestinationId = specDestinationId;
        this.specArrivalDeadline = specArrivalDeadline;
        this.originId = originId;
        this.bookingAmount = bookingAmount;
        this.handlingEventId = handlingEventId;
        this.nextExpectedLocationId = nextExpectedLocationId;
        this.nextExpectedHandlingEventType = nextExpectedHandlingEventType;
        this.nextExpectedVoyageId = nextExpectedVoyageId;
        this.lastKnownLocationId = lastKnownLocationId;
        this.currentVoyageNumber = currentVoyageNumber;
        this.lastHandlingEventId = lastHandlingEventId;
        this.lastHandlingEventType = lastHandlingEventType;
        this.lastHandlingEventLocation = lastHandlingEventLocation;
        this.lastHandlingEventVoyage = lastHandlingEventVoyage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    public CargoDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.ID
     *
     * @return the value of cargo.ID
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.ID
     *
     * @param id the value for cargo.ID
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.BOOKING_ID
     *
     * @return the value of cargo.BOOKING_ID
     *
     * @mbg.generated
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.BOOKING_ID
     *
     * @param bookingId the value for cargo.BOOKING_ID
     *
     * @mbg.generated
     */
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId == null ? null : bookingId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.TRANSPORT_STATUS
     *
     * @return the value of cargo.TRANSPORT_STATUS
     *
     * @mbg.generated
     */
    public String getTransportStatus() {
        return transportStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.TRANSPORT_STATUS
     *
     * @param transportStatus the value for cargo.TRANSPORT_STATUS
     *
     * @mbg.generated
     */
    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus == null ? null : transportStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.ROUTING_STATUS
     *
     * @return the value of cargo.ROUTING_STATUS
     *
     * @mbg.generated
     */
    public String getRoutingStatus() {
        return routingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.ROUTING_STATUS
     *
     * @param routingStatus the value for cargo.ROUTING_STATUS
     *
     * @mbg.generated
     */
    public void setRoutingStatus(String routingStatus) {
        this.routingStatus = routingStatus == null ? null : routingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.spec_origin_id
     *
     * @return the value of cargo.spec_origin_id
     *
     * @mbg.generated
     */
    public String getSpecOriginId() {
        return specOriginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.spec_origin_id
     *
     * @param specOriginId the value for cargo.spec_origin_id
     *
     * @mbg.generated
     */
    public void setSpecOriginId(String specOriginId) {
        this.specOriginId = specOriginId == null ? null : specOriginId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.spec_destination_id
     *
     * @return the value of cargo.spec_destination_id
     *
     * @mbg.generated
     */
    public String getSpecDestinationId() {
        return specDestinationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.spec_destination_id
     *
     * @param specDestinationId the value for cargo.spec_destination_id
     *
     * @mbg.generated
     */
    public void setSpecDestinationId(String specDestinationId) {
        this.specDestinationId = specDestinationId == null ? null : specDestinationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.SPEC_ARRIVAL_DEADLINE
     *
     * @return the value of cargo.SPEC_ARRIVAL_DEADLINE
     *
     * @mbg.generated
     */
    public Date getSpecArrivalDeadline() {
        return specArrivalDeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.SPEC_ARRIVAL_DEADLINE
     *
     * @param specArrivalDeadline the value for cargo.SPEC_ARRIVAL_DEADLINE
     *
     * @mbg.generated
     */
    public void setSpecArrivalDeadline(Date specArrivalDeadline) {
        this.specArrivalDeadline = specArrivalDeadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.origin_id
     *
     * @return the value of cargo.origin_id
     *
     * @mbg.generated
     */
    public String getOriginId() {
        return originId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.origin_id
     *
     * @param originId the value for cargo.origin_id
     *
     * @mbg.generated
     */
    public void setOriginId(String originId) {
        this.originId = originId == null ? null : originId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.BOOKING_AMOUNT
     *
     * @return the value of cargo.BOOKING_AMOUNT
     *
     * @mbg.generated
     */
    public Integer getBookingAmount() {
        return bookingAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.BOOKING_AMOUNT
     *
     * @param bookingAmount the value for cargo.BOOKING_AMOUNT
     *
     * @mbg.generated
     */
    public void setBookingAmount(Integer bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.handling_event_id
     *
     * @return the value of cargo.handling_event_id
     *
     * @mbg.generated
     */
    public Integer getHandlingEventId() {
        return handlingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.handling_event_id
     *
     * @param handlingEventId the value for cargo.handling_event_id
     *
     * @mbg.generated
     */
    public void setHandlingEventId(Integer handlingEventId) {
        this.handlingEventId = handlingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.next_expected_location_id
     *
     * @return the value of cargo.next_expected_location_id
     *
     * @mbg.generated
     */
    public String getNextExpectedLocationId() {
        return nextExpectedLocationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.next_expected_location_id
     *
     * @param nextExpectedLocationId the value for cargo.next_expected_location_id
     *
     * @mbg.generated
     */
    public void setNextExpectedLocationId(String nextExpectedLocationId) {
        this.nextExpectedLocationId = nextExpectedLocationId == null ? null : nextExpectedLocationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.next_expected_handling_event_type
     *
     * @return the value of cargo.next_expected_handling_event_type
     *
     * @mbg.generated
     */
    public String getNextExpectedHandlingEventType() {
        return nextExpectedHandlingEventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.next_expected_handling_event_type
     *
     * @param nextExpectedHandlingEventType the value for cargo.next_expected_handling_event_type
     *
     * @mbg.generated
     */
    public void setNextExpectedHandlingEventType(String nextExpectedHandlingEventType) {
        this.nextExpectedHandlingEventType = nextExpectedHandlingEventType == null ? null : nextExpectedHandlingEventType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.next_expected_voyage_id
     *
     * @return the value of cargo.next_expected_voyage_id
     *
     * @mbg.generated
     */
    public String getNextExpectedVoyageId() {
        return nextExpectedVoyageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.next_expected_voyage_id
     *
     * @param nextExpectedVoyageId the value for cargo.next_expected_voyage_id
     *
     * @mbg.generated
     */
    public void setNextExpectedVoyageId(String nextExpectedVoyageId) {
        this.nextExpectedVoyageId = nextExpectedVoyageId == null ? null : nextExpectedVoyageId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.last_known_location_id
     *
     * @return the value of cargo.last_known_location_id
     *
     * @mbg.generated
     */
    public String getLastKnownLocationId() {
        return lastKnownLocationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.last_known_location_id
     *
     * @param lastKnownLocationId the value for cargo.last_known_location_id
     *
     * @mbg.generated
     */
    public void setLastKnownLocationId(String lastKnownLocationId) {
        this.lastKnownLocationId = lastKnownLocationId == null ? null : lastKnownLocationId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.current_voyage_number
     *
     * @return the value of cargo.current_voyage_number
     *
     * @mbg.generated
     */
    public String getCurrentVoyageNumber() {
        return currentVoyageNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.current_voyage_number
     *
     * @param currentVoyageNumber the value for cargo.current_voyage_number
     *
     * @mbg.generated
     */
    public void setCurrentVoyageNumber(String currentVoyageNumber) {
        this.currentVoyageNumber = currentVoyageNumber == null ? null : currentVoyageNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.last_handling_event_id
     *
     * @return the value of cargo.last_handling_event_id
     *
     * @mbg.generated
     */
    public Integer getLastHandlingEventId() {
        return lastHandlingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.last_handling_event_id
     *
     * @param lastHandlingEventId the value for cargo.last_handling_event_id
     *
     * @mbg.generated
     */
    public void setLastHandlingEventId(Integer lastHandlingEventId) {
        this.lastHandlingEventId = lastHandlingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.last_handling_event_type
     *
     * @return the value of cargo.last_handling_event_type
     *
     * @mbg.generated
     */
    public String getLastHandlingEventType() {
        return lastHandlingEventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.last_handling_event_type
     *
     * @param lastHandlingEventType the value for cargo.last_handling_event_type
     *
     * @mbg.generated
     */
    public void setLastHandlingEventType(String lastHandlingEventType) {
        this.lastHandlingEventType = lastHandlingEventType == null ? null : lastHandlingEventType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.last_handling_event_location
     *
     * @return the value of cargo.last_handling_event_location
     *
     * @mbg.generated
     */
    public String getLastHandlingEventLocation() {
        return lastHandlingEventLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.last_handling_event_location
     *
     * @param lastHandlingEventLocation the value for cargo.last_handling_event_location
     *
     * @mbg.generated
     */
    public void setLastHandlingEventLocation(String lastHandlingEventLocation) {
        this.lastHandlingEventLocation = lastHandlingEventLocation == null ? null : lastHandlingEventLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cargo.last_handling_event_voyage
     *
     * @return the value of cargo.last_handling_event_voyage
     *
     * @mbg.generated
     */
    public String getLastHandlingEventVoyage() {
        return lastHandlingEventVoyage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cargo.last_handling_event_voyage
     *
     * @param lastHandlingEventVoyage the value for cargo.last_handling_event_voyage
     *
     * @mbg.generated
     */
    public void setLastHandlingEventVoyage(String lastHandlingEventVoyage) {
        this.lastHandlingEventVoyage = lastHandlingEventVoyage == null ? null : lastHandlingEventVoyage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CargoDO other = (CargoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookingId() == null ? other.getBookingId() == null : this.getBookingId().equals(other.getBookingId()))
            && (this.getTransportStatus() == null ? other.getTransportStatus() == null : this.getTransportStatus().equals(other.getTransportStatus()))
            && (this.getRoutingStatus() == null ? other.getRoutingStatus() == null : this.getRoutingStatus().equals(other.getRoutingStatus()))
            && (this.getSpecOriginId() == null ? other.getSpecOriginId() == null : this.getSpecOriginId().equals(other.getSpecOriginId()))
            && (this.getSpecDestinationId() == null ? other.getSpecDestinationId() == null : this.getSpecDestinationId().equals(other.getSpecDestinationId()))
            && (this.getSpecArrivalDeadline() == null ? other.getSpecArrivalDeadline() == null : this.getSpecArrivalDeadline().equals(other.getSpecArrivalDeadline()))
            && (this.getOriginId() == null ? other.getOriginId() == null : this.getOriginId().equals(other.getOriginId()))
            && (this.getBookingAmount() == null ? other.getBookingAmount() == null : this.getBookingAmount().equals(other.getBookingAmount()))
            && (this.getHandlingEventId() == null ? other.getHandlingEventId() == null : this.getHandlingEventId().equals(other.getHandlingEventId()))
            && (this.getNextExpectedLocationId() == null ? other.getNextExpectedLocationId() == null : this.getNextExpectedLocationId().equals(other.getNextExpectedLocationId()))
            && (this.getNextExpectedHandlingEventType() == null ? other.getNextExpectedHandlingEventType() == null : this.getNextExpectedHandlingEventType().equals(other.getNextExpectedHandlingEventType()))
            && (this.getNextExpectedVoyageId() == null ? other.getNextExpectedVoyageId() == null : this.getNextExpectedVoyageId().equals(other.getNextExpectedVoyageId()))
            && (this.getLastKnownLocationId() == null ? other.getLastKnownLocationId() == null : this.getLastKnownLocationId().equals(other.getLastKnownLocationId()))
            && (this.getCurrentVoyageNumber() == null ? other.getCurrentVoyageNumber() == null : this.getCurrentVoyageNumber().equals(other.getCurrentVoyageNumber()))
            && (this.getLastHandlingEventId() == null ? other.getLastHandlingEventId() == null : this.getLastHandlingEventId().equals(other.getLastHandlingEventId()))
            && (this.getLastHandlingEventType() == null ? other.getLastHandlingEventType() == null : this.getLastHandlingEventType().equals(other.getLastHandlingEventType()))
            && (this.getLastHandlingEventLocation() == null ? other.getLastHandlingEventLocation() == null : this.getLastHandlingEventLocation().equals(other.getLastHandlingEventLocation()))
            && (this.getLastHandlingEventVoyage() == null ? other.getLastHandlingEventVoyage() == null : this.getLastHandlingEventVoyage().equals(other.getLastHandlingEventVoyage()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookingId() == null) ? 0 : getBookingId().hashCode());
        result = prime * result + ((getTransportStatus() == null) ? 0 : getTransportStatus().hashCode());
        result = prime * result + ((getRoutingStatus() == null) ? 0 : getRoutingStatus().hashCode());
        result = prime * result + ((getSpecOriginId() == null) ? 0 : getSpecOriginId().hashCode());
        result = prime * result + ((getSpecDestinationId() == null) ? 0 : getSpecDestinationId().hashCode());
        result = prime * result + ((getSpecArrivalDeadline() == null) ? 0 : getSpecArrivalDeadline().hashCode());
        result = prime * result + ((getOriginId() == null) ? 0 : getOriginId().hashCode());
        result = prime * result + ((getBookingAmount() == null) ? 0 : getBookingAmount().hashCode());
        result = prime * result + ((getHandlingEventId() == null) ? 0 : getHandlingEventId().hashCode());
        result = prime * result + ((getNextExpectedLocationId() == null) ? 0 : getNextExpectedLocationId().hashCode());
        result = prime * result + ((getNextExpectedHandlingEventType() == null) ? 0 : getNextExpectedHandlingEventType().hashCode());
        result = prime * result + ((getNextExpectedVoyageId() == null) ? 0 : getNextExpectedVoyageId().hashCode());
        result = prime * result + ((getLastKnownLocationId() == null) ? 0 : getLastKnownLocationId().hashCode());
        result = prime * result + ((getCurrentVoyageNumber() == null) ? 0 : getCurrentVoyageNumber().hashCode());
        result = prime * result + ((getLastHandlingEventId() == null) ? 0 : getLastHandlingEventId().hashCode());
        result = prime * result + ((getLastHandlingEventType() == null) ? 0 : getLastHandlingEventType().hashCode());
        result = prime * result + ((getLastHandlingEventLocation() == null) ? 0 : getLastHandlingEventLocation().hashCode());
        result = prime * result + ((getLastHandlingEventVoyage() == null) ? 0 : getLastHandlingEventVoyage().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cargo
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookingId=").append(bookingId);
        sb.append(", transportStatus=").append(transportStatus);
        sb.append(", routingStatus=").append(routingStatus);
        sb.append(", specOriginId=").append(specOriginId);
        sb.append(", specDestinationId=").append(specDestinationId);
        sb.append(", specArrivalDeadline=").append(specArrivalDeadline);
        sb.append(", originId=").append(originId);
        sb.append(", bookingAmount=").append(bookingAmount);
        sb.append(", handlingEventId=").append(handlingEventId);
        sb.append(", nextExpectedLocationId=").append(nextExpectedLocationId);
        sb.append(", nextExpectedHandlingEventType=").append(nextExpectedHandlingEventType);
        sb.append(", nextExpectedVoyageId=").append(nextExpectedVoyageId);
        sb.append(", lastKnownLocationId=").append(lastKnownLocationId);
        sb.append(", currentVoyageNumber=").append(currentVoyageNumber);
        sb.append(", lastHandlingEventId=").append(lastHandlingEventId);
        sb.append(", lastHandlingEventType=").append(lastHandlingEventType);
        sb.append(", lastHandlingEventLocation=").append(lastHandlingEventLocation);
        sb.append(", lastHandlingEventVoyage=").append(lastHandlingEventVoyage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}