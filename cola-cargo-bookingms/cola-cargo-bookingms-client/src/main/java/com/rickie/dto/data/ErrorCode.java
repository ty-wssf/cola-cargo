package com.rickie.dto.data;

public enum ErrorCode{
    NULL("NULL", "对象为空"),
    B_CUSTOMER_companyNameConflict("B_CUSTOMER_companyNameConflict", "客户公司名冲突"),
    LOCATION_EMPTY("LOCATION_EMPTY", "位置为空"),
    BOOKING_AMOUNT_NEGATIVE("BOOKING_AMOUNT_NEGATIVE", "预订数量不能为负数"),
    CARGO_BOOKING_REQUEST_ERROR("CARGO_BOOKING_REQUEST_ERROR", "包裹预订请求参数错误"),
    BOOKINGID_NOT_EXIST("BOOKINGID_NOT_EXIST", "预订号BookingId不存在");

    private final String errCode;
    private final String errDesc;

    private ErrorCode(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrDesc() {
        return errDesc;
    }
}
