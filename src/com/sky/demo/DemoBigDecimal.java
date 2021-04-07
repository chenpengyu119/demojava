package com.sky.demo;

import java.math.BigDecimal;

public class DemoBigDecimal {
    public static void main(String[] args) {
     /*   BigDecimal bigDecimal = new BigDecimal(10);
        BigDecimal bigDecimal2 = new BigDecimal(3);
        BigDecimal divide = bigDecimal.divide(bigDecimal2,2,BigDecimal.ROUND_HALF_UP)
                .setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.printf(divide.toString());*/
        demo2();
    }


    private static void  demo1(){
        BigDecimal b = new BigDecimal(1.2708789).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(b.doubleValue());

    }

    private static void demo2(){
        System.out.println(new BigDecimal("22").compareTo(new BigDecimal("1"))>0);
    }
}
