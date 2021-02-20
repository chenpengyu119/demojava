package com.sky.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author pengyu
 * @date 2020/8/7 10:36
 */
public class DemoLisg {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("1");
        list.add(null);
        System.out.println(list.size());
         list= list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(list.size());
    }
}
