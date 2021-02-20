package com.sky.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author pengyu
 * @date 2020/5/18 4:01 下午
 */
public class DemoSortMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("商务",10);
        map.put("VIP",17);
        map.put("政务",20);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

    }
}
