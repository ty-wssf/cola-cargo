package com.rickie.handling.domain.model.valueobjects;

/**
 * @author rickie
 * @version 1.0.0
 * @ClassName EventType.java
 * @Description TODO
 * @createTime 2021年07月24日 23:26:00
 */
public enum EventType {
    // Loaded onto voyage from port location.
    LOAD(true),
    // Unloaded from voyage to port location
    UNLOAD(true),
    // Received by carrier
    RECEIVE(false),
    // CargoBookingId claimed by recepient
    CLAIM(false),
    // CargoBookingId went through customs
    CUSTOMS(false);

    // 是否需要航程号
    private final boolean voyageRequired;
    private EventType(boolean voyageRequired){
        this.voyageRequired = voyageRequired;
    }
    // True 表示该事件类型需要一个关联的航程号
    public boolean requiresVoyage() {
        return voyageRequired;
    }
    // True 表示该事件类型禁止关联航程号
    public boolean prohibitsVoyage() {
        return !requiresVoyage();
    }
    public boolean sameValueAs(EventType other) {
        return other != null && this.equals(other);
    }
}
