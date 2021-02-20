package com.sky.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengyu
 * @date 2020/5/29 10:33 上午
 */
public class DemoListIntercept {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
/*        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");*/
        if (list.size()>10) {
            list = list.subList(0, 10);
        }
        System.out.println(list.size());
    }
}
