package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/5/11 6:22 下午
 */
public class DemoThread {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName());
            prtName();
        }
    }

    private static void prtName(){
        System.out.println(Thread.currentThread().getName());
    }
}
