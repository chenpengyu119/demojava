package com.sky.demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author pengyu
 * @date 2020/8/5 13:12
 */
public class DemoArray {

    public static void main(String[] args) {
        demo4();
    }

    private static void demo2(){
        System.out.println("1".equals(null));
    }

    private static void demo3(){
        String str = "";
        String[] split = str.split(",");
        System.out.println(split.length);
        System.out.println(split[0]);
    }


    /**
     * asList 基本类型,因为list的范型成了数组类型
     */
    private static void demo4(){
        int[] arr = new int[]{1,2,3,4,5};
        List<int[]> ints = Arrays.asList(arr);
        System.out.println(ints.size());
    }
}
