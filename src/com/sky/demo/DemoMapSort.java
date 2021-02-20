package com.sky.demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author pengyu
 * @date 2020/6/19 3:23 下午
 */
public class DemoMapSort {

    public static void main(String[] args) {
        Map<String , List<String>> map = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("3");
        list1.add("2");
        map.put("a",list1);
        List<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("5");
        list2.add("1");
        map.put("b",list2);
        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            List<String> value = entry.getValue();
            value = value.stream().sorted(Comparator.comparing(f->f)).collect(Collectors.toList());
            map.put(entry.getKey(),value);
        }

        Set<Map.Entry<String, List<String>>> entries1 = map.entrySet();
        for (Map.Entry<String, List<String>> stringListEntry : entries1) {
            List<String> value = stringListEntry.getValue();
            for (String s : value) {
                System.out.println(s);
            }
        }
    }
}
