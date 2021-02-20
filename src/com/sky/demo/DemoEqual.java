package com.sky.demo;

import java.util.Objects;

/**
 * @author pengyu
 * @date 2020/6/23 2:05 下午
 */
public class DemoEqual {
    public static void main(String[] args) {

       // System.out.println(Objects.equals(1,new Integer(1)));
        demoJudegNull();
    }

    private static void demoJudegNull(){
        System.out.println(Objects.equals(1,new Integer(1)));
    }

    private static void demoNull(){
        Integer str = null;
        System.out.println(new Integer(1)==str);
    }


}
