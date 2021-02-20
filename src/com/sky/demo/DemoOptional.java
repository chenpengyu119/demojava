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

    }
}
