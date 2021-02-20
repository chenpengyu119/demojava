package com.sky.demo;

import java.math.BigDecimal;

public class DemoJudge {

    public static void main(String[] args) {
        double dou = 0.58;
        BigDecimal a = new BigDecimal(0.58623);
        BigDecimal b = new BigDecimal(100);
        System.out.println(b.multiply(a.setScale(2,BigDecimal.ROUND_HALF_UP))+"%");
        BigDecimal c = a.setScale(2,BigDecimal.ROUND_HALF_UP).multiply(b);
        c= c.setScale(2,BigDecimal.ROUND_HALF_UP);

        System.out.println(c);
    }
}


