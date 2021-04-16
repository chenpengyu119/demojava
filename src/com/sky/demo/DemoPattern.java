package com.sky.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengyu
 * @date 2020/6/24 1:09 下午
 */
public class DemoPattern {
    //private static Pattern deptPat = Pattern.compile("\\S{2,5}");
    private static Pattern deptPat = Pattern.compile("[\\d-]{0,9}");

    private static final String REGEX_COLOR_CODE = "#[\\da-fA-F]{6}";

    private static Pattern fltNoPat = Pattern.compile("([a-zA-Z])*(\\d)*[a-zA-Z\\d]*");

    public static void main(String[] args) {
     /*   CharSequence input;
        Matcher m = deptPat.matcher(null);
        System.out.println(m.matches());*/
     demo5();
    }

    private static void demo5(){
        Pattern pn = Pattern.compile(REGEX_COLOR_CODE);
        System.out.println(pn.matcher("#111121").matches());
    }

    private static void demo4(){
        Matcher matcher = fltNoPat.matcher("22");
        System.out.println(matcher.matches());
    }

    private static void demo3(){

        Matcher matcher = deptPat.matcher("2020-10-01");
        System.out.println(matcher.matches());
    }
}
