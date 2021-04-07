package com.sky.demo;

import java.util.HashSet;

/**
 * @author pengyu
 * @date 2020/5/27 1:09 下午
 */
public class DemoSet {
    public static void main(String[] args) {
        HashSet set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("2");
        set.add(null);
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("是否包含空"+set.contains(null));
    }
}
