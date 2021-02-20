package com.sky.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author pengyu
 * @date 2020/8/13 15:46
 */
public class DemoIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("国内");
        list.add("国际");
        list.add("港澳台");
        Iterator<String> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()){
            String next = iterator.next();
            if ("国际".equals(next)){
                iterator.remove();
                count++;
            }
        }
        System.out.println("Count"+count);
        System.out.println(list);
    }
}
