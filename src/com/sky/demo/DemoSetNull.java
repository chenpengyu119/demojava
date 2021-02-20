package com.sky.demo;

/**
 * @author pengyu
 * @date 2020/4/14 2:58 下午
 */
public class DemoSetNull {

    public static void main(String[] args) {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setName(null);
        demoEntity.setId(null);
        System.out.println(demoEntity.getName());
    }
}
