package com.sky.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengyu
 * @date 2020/8/12 17:09
 */
public class DemoList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.hashCode());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        list.removeIf("B"::equals);
        //System.out.println(list.size());
        System.out.println(list.hashCode());
        demo22();

    }

    private static void demo2a(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        int b = list.indexOf("B");
        System.out.println(b);
        System.out.println(list.subList(0, b+1));
    }

    private static void demo22(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
    }
}
