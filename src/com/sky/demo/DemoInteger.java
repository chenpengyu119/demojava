package com.sky.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengyu
 * @date 2020/8/24 15:13
 */
public class DemoInteger {

    public static void main(String[] args) {
        demo4();
    }

    private static void demo4(){
        System.out.println(Integer.MAX_VALUE);
    }

    private static void demo1(){
        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        System.out.println(int1.equals(int2));
        System.out.println(int1==1);
    }

    private static void demo2(){
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list = list.subList(0,5 );
        System.out.println(list.size());
    }

    private static void demo3(){
        String str = "\\d|-|/{10}";

    }
}
