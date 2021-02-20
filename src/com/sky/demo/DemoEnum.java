package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/8/11 14:14
 */
public enum DemoEnum {


    /**
     *
     */
    CHECK_IN("checkIn"),

    CHECKIN("checkIN")
    ;
    private String code;

    DemoEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
