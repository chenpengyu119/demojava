package com.sky.demo;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author pengyu
 * @date 2020/5/13 11:10 下午
 */
public class DemoTimeSeg {

    public static void main(String[] args) {
        long l = countDateIntersection("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 13:00:00"
                , "2020-05-01 14:00:00");
        System.out.println(l);

        long m = countDateIntersection("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 09:00:00"
                , "2020-05-01 09:30:00");
        System.out.println(m);

        long n = countDateIntersection("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 10:30:00"
                , "2020-05-01 12:30:00");
        System.out.println(n);

        long p = countDateIntersection("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 08:30:00"
                , "2020-05-01 12:30:00");
        System.out.println(p);

        /**
         * ********
         */
        String [] l1 = countDateIntersection2("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 13:00:00"
                , "2020-05-01 14:00:00");
        System.out.println(Arrays.toString(l1));

        String [] m2 = countDateIntersection2("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 09:00:00"
                , "2020-05-01 09:30:00");
        System.out.println(Arrays.toString(m2));

        String [] n2 = countDateIntersection2("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 10:30:00"
                , "2020-05-01 12:30:00");
        System.out.println(Arrays.toString(n2));

        String [] p2 = countDateIntersection2("2020-05-01 10:00:00"
                , "2020-05-01 11:00:00"
                , "2020-05-01 08:30:00"
                , "2020-05-01 12:30:00");
        System.out.println(Arrays.toString(p2));

    }




    /**
     *  交集的毫秒数
     * @param start1
     * @param end1
     * @param start2
     * @param end2
     * @return
     */
    public static long countDateIntersection(String start1 , String end1 , String  start2 , String  end2){
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long s1 = 0;
        long s2 = 0;
        long e1 = 0;
        long e2 = 0;
        try {
         //标准化到1970-01-01
            s1 = sdf2.parse(start1).getTime();
            s2 = sdf2.parse(start2).getTime();
            e1 = sdf2.parse(end1).getTime();
            e2 = sdf2.parse(end2).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(!(s2>e1||s1>e2)){
            long s = s1>s2?s1:s2;
            long e = e1<e2?e1:e2;
            return e-s;
        }
        return 0;
    }

    public static String[] countDateIntersection2(String start1 , String end1 , String  start2 , String  end2){
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long s1 = 0;
        long s2 = 0;
        long e1 = 0;
        long e2 = 0;
        try {
            //标准化到1970-01-01
            s1 = sdf2.parse(start1).getTime();
            s2 = sdf2.parse(start2).getTime();
            e1 = sdf2.parse(end1).getTime();
            e2 = sdf2.parse(end2).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(!(s2>e1||s1>e2)){
            String s = s1>s2?start1:start2;
            String  e = e1<e2?end1:end2;
             String [] sn = new String[2];
             sn[0] = s;
             sn[1]=e;
            return  sn;
        }
        return new String[2];
    }


}
