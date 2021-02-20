package com.sky.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * @author pengyu
 * @date 2020/8/7 13:15
 */
public class DemoLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.parse("2020-07-01 06:00:00",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTime dateTime2 = LocalDateTime.parse("2020-07-01 04:00:00",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime1.isBefore(dateTime2));
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, 0);

    }
}
