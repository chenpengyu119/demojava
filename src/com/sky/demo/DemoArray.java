package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/8/5 13:12
 */
public class DemoArray {

    public static void main(String[] args) {
        demo3();
    }

    private static void demo2(){
        System.out.println("1".equals(null));
    }

    private static void demo3(){
        String str = "";
        String[] split = str.split(",");
        System.out.println(split.length);
        System.out.println(split[0]);
    }
}
