package com.sky.demo;

import java.util.Objects;
import java.util.Optional;

/**
 * @author pengyu
 * @date 2020/6/11 4:38 下午
 */
public class DemoOptional {
    public static void main(String[] args) {
        Integer dur = null;
        String res = Optional.ofNullable(dur).orElse(0).toString();
        System.out.println(res);
        demo1();
    }


    public static void demo1(){
        Optional<String> op1 = Optional.ofNullable(null);
        System.out.println(op1.isPresent());
        Optional<String> op2 = Optional.of("22");
        System.out.println(op2.isPresent());
    }
}
