package com.sky.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author pengyu
 * @date 2020/4/11 9:17 下午
 */
public class DemoDate {


    /**
     * default date-time format
     */
    private static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
       // System.out.println(afterTime("2020-10-01 00:00:00",30));
        /*List<String> monthDay = new DemoDate().getMonthDay("2021-02-01");
        for (String s : monthDay) {
            System.out.print(s+"  ");
        }*/
        demo2();
    }

    private static void demo1(){
        String format = "yyyy-mm-dd";
        SimpleDateFormat format1 = new SimpleDateFormat(format);
        System.out.println(format1.format(new Date()));
    }


    public static String afterTime(String dateTime,int hour){
        SimpleDateFormat format = new SimpleDateFormat(STANDARD_FORMAT);
        Date start = null;
        try {
            start = format.parse(dateTime);
        } catch (ParseException e) {

        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        // add方法中的第二个参数n中，正数表示该日期后n天，负数表示该日期的前n天
        calendar.add(Calendar.HOUR_OF_DAY,hour);
        Date end = calendar.getTime();
        return format.format(end);
    }

    public List<String> getMonthDay(String date) {
        List<String> list = getMonthFullDay(date);
        List<String> listDay = new ArrayList<>();
        for (String date1 : list) {
            listDay.add(date1);
        }
        return listDay;
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public List<String> getMonthFullDay(String date) {
        List<String> fullDayList = new ArrayList<String>();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = 1;// 所有月份从1号开始
        Calendar cal = Calendar.getInstance();// 获得当前日期对象
        cal.clear();// 清除信息
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);// 1月从0开始
        cal.set(Calendar.DAY_OF_MONTH, day);
        int count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int j = 0; j <= (count - 1); ) {
            if (sdf.format(cal.getTime()).equals(getLastDay(year, month)))
                break;
            cal.add(Calendar.DAY_OF_MONTH, j == 0 ? +0 : +1);
            j++;
            fullDayList.add(sdf.format(cal.getTime()));
        }
        return fullDayList;
    }

    public String getLastDay(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, 0);
        return sdf.format(cal.getTime());
    }


    private static void demo2(){
        System.out.println("1612704605455");

    }




}
