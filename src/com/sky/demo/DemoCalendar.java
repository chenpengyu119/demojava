package com.sky.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author pengyu
 * @date 2021/2/3 11:28
 */
public class DemoCalendar {

    public static void main(String[] args) {
      /*  Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -1);
        Date time = calendar.getTime();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time));*/
        demo1();
    }

    private static void demo1(){
        Calendar now = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        now.set(Calendar.MINUTE, now.get(Calendar.MINUTE)-30);
        now.set(Calendar.MINUTE, now.get(Calendar.MINUTE)-30);
        System.out.println(format.format(now.getTime()));
        System.out.println(Calendar.getInstance().get(Calendar.MINUTE));


        Calendar calendar = Calendar.getInstance();
       /* int currMin = calendar.get(Calendar.MINUTE);
        int interval = 10;
                calendar.set(Calendar.MINUTE, currMin - (currMin&interval));
        System.out.println(calendar.get(Calendar.MINUTE));*/
      /*  calendar.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY)-24);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));*/
        System.out.println(dealDateFormat("2019-05-01T10:00:00.000Z"));
    }

    public static String dealDateFormat(String oldDate) {
        Date date1 = null;
        DateFormat df2 = null;
        try {
            oldDate= oldDate.replace("Z", " UTC");
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z");
            Date date = df.parse(oldDate);
            SimpleDateFormat df1 = new SimpleDateFormat ("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
            date1 = df1.parse(date.toString());
            df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return df2.format(date1);
    }
}
