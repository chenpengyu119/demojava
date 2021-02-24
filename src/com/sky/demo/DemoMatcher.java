package com.sky.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengyu
 * @date 2021/2/24 14:25
 */
public class DemoMatcher {

    /**
     * 匹配多位数字的正则
     */
    private static final Pattern PATTERN = Pattern.compile("\\d+");

    public static void main(String[] args) {
        demo1();
    }

    private static void demo1(){
        String content = "AB12CD34";
        Matcher matcher = PATTERN.matcher(content);
        boolean res = matcher.find();
        String group = matcher.group(0);
        System.out.println("group:"+group);
        int end = matcher.end();
        System.out.println(end);
        System.out.println(res);
    }
}
