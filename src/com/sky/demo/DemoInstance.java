package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/5/6 4:38 下午
 */
public class DemoInstance {
    public static void main(String[] args) {
        IllegalArgumentException e = new IllegalArgumentException();
        System.out.println(e instanceof Exception);
        System.out.println(e instanceof RuntimeException);
    }
}
