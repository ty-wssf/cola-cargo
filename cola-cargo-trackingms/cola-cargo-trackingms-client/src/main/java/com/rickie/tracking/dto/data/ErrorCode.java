package com.rickie.tracking.dto.data;

public enum ErrorCode{
    BOOKINGID_NOT_EXIST("BOOKINGID_NOT_EXIST", "预订号不存在");

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
