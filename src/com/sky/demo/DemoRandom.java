package com.sky.demo;

import java.util.Random;

/**
 * @author pengyu
 * @date 2021/1/12 16:57
 */
public class DemoRandom {

    public static void main(String[] args) {
        demo1();
    }


    private static void demo1(){
        Random rm = new Random();
        System.out.println(rm.nextInt(10));
    }
}
