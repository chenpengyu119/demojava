package com.sky.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pengyu
 * @date 2020/8/21 10:09
 */
public class DemoStringUtils {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis() + 60 * 60 * 1000L);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(date));

    }


}
