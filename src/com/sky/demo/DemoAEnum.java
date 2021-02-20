package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/8/11 14:15
 */
public class DemoAEnum {

    public static void main(String[] args) {

        System.out.println(DemoEnum.valueOf("CHECK_IN").getCode());
        System.out.println(DemoEnum.valueOf("CHECKIN").getCode());
    }
}
