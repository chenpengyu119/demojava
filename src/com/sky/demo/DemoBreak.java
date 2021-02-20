package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/5/22 2:40 下午
 */
public class DemoBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("开始"+i);
            try {
                System.out.println(1/0);
            } catch (Exception e) {
                System.out.println("异常");
                break;
            }
            System.out.println("结束"+i);
        }
    }
}
