package com.sky.demo;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author pengyu
 * @date 2020/5/13 1:59 下午
 */
public class DemoString {
    public static void main(String[] args) {
      //  System.out.println(new DemoString().getConnFltNo("AB8375","CZ1234"));;
        new DemoString().demoIntern();
    }

    private static void demo22(){
        String str = "青岛-常州-昆明";
        String[] split = str.split("-");
        System.out.println(split[1]);
    }

    /**
     * 去除0
     */
    private static void demo23(){
        String str = "005";
        String tmpStr = str;
        for (int i = 0; i < str.length(); i++) {
            if ("0".equals(tmpStr.substring(i,i+1))){
                tmpStr = tmpStr.substring(i+1);
            }
        }
    }

    private static void demo24(){
        String park = "005";
        String newStr = park.replaceAll("^(0+)", "");
        System.out.println(newStr);
    }

    /**
     * 替换字符串
     * @param curr 插入位置
     * @param origin  原字符串数组
     * @param insStr 插入的字符串
     * @return 结果
     */
    private static String replaceStr(int curr, String[] origin, String insStr){
        List<String> tmpList = Arrays.asList(origin);
        List<String> allList = new ArrayList<>(tmpList.subList(0, curr));
        allList.add(insStr);
        allList.addAll(tmpList.subList(curr, origin.length));
        StringBuilder tmp = new StringBuilder();
        for (String str : allList) {
            tmp.append(str).append(",");
        }
        String res = tmp.toString();
        if (",".equals(res.substring(res.length()-1))){
            res = res.substring(0, res.length()-1);
        }
        return res;
    }

    private static void demo18(){
        System.out.println("arr".toLowerCase());
    }

    private static void demo16(){
        String str = "123,";
        System.out.println(str.substring(str.length()-1));
    }

    private static void demo17(){
        String str = "123,";
        System.out.println(str.substring(0,str.length()-1));
    }

    private static void demo15(){
        System.out.println("2020-08-31 00:00:00".substring(0,10));
    }

    private static void demo14(){
        System.out.println();
    }

    private static void demo13(){
        System.out.println("12,12,".substring("12,12,".length()-1));
    }

    private static void demo12(){
        System.out.println("CA1571/CA1572".substring("CA1571/CA1572".indexOf("/")+1));
    }

    private static void demo11(){
        String str = "hello";
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf("l"));
    }

    private static void demoSubString(){
        String arr = "TAO-(SHE)-LFQ";
        String res = arr.substring(arr.indexOf("(")+1,arr.indexOf(")"));
        System.out.println(res);
    }

    private static void demo4(){
        String status = "开始登机，结束登机，开始值机";
        System.out.println(status.substring(0,0).contains("1"));
    }

    private static void demo1(){
        String str = "03";
        System.out.println(Integer.parseInt(str));
    }

    private static void changeStr(String str){
        str = "fjifji";
    }


    private static void demo2(){
        Optional<Object> o = Optional.ofNullable("123");
        System.out.println(o.orElse("ff"));
       // o.
    }

    private static void demo3(){
        System.out.println("16239".substring(0,-1));
    }

    private static void demo5(){
        System.out.println("242"+null);
    }

    private static void demo6(){
        String str = "20/2002/22";

        System.out.println(str.split("/")[0]);
    }

    private static void replace(){
        String str = "返航本场";
        System.out.println(str.replace("备降","返航"));
    }

    private static void demoOption(){
        String str1 = "";
        System.out.println(Optional.ofNullable(str1).orElse("我"));
    }

    private static void demoAddString(){
        System.out.println(String.valueOf(null));
    }

    private static void demoSub(){
        System.out.println("".substring(5));
    }

    private static void demo8(){
        String str= "成都-青岛";
        System.out.println(str.lastIndexOf("-"));
        System.out.println(str.substring(0,str.lastIndexOf("-")));
    }

    private static void demo9(){
        String dep = "青岛-深圳-南宁";
        System.out.println(dep.substring(dep.indexOf("-"),dep.length()));
    }

    private static void demo10(){
        String sgtr = "12345678900";
        if (sgtr.length()>10){
            System.out.println(sgtr.substring(0,10));
        }

    }



    private static void demo121(){
        System.out.println("2021-01-13 14:49:20".substring(11,16));
    }

    private static void demo122(){
        String str = "224";
        System.out.println("223".substring("223".length()-1));
        System.out.println(str.substring(0,str.length()-1));
    }

    private static void demo123(){
        System.out.println("12".substring(0,1));
    }



    /**
     * 计算关联航班号缩写
     * @return
     */
    private String getConnFltNo(String arrFltNo, String depFltNo){
        StringBuilder eqSb = new StringBuilder();
        for (int i = 0; i < arrFltNo.length(); i++) {
            String arr = arrFltNo.substring(i, i + 1);
            String dep = depFltNo.substring(i,i+1);
            if (arr.equals(dep)){
                eqSb.append(arr);
            }else {
                break;
            }
        }
        String eqStr = eqSb.toString();
        return eqStr+arrFltNo.replace(eqSb, "")+"/"+depFltNo.replace(eqSb, "");
    }

    private void demo29(){
        String str = "ss+";
        System.out.println(str.lastIndexOf("+")==str.length()-1);
        str = str.substring(0, str.length()-1);
        System.out.println(str);
    }


    private void demoIntern(){
        // 如果常量池有，则返回引用，否则在常量池记录引用
        String a = "a";
        String b = new String("a");
        String intern = b.intern();
        System.out.println(b.equals(intern));
        System.out.println(a==intern);
        System.out.println(b==intern);

        String s1 = new String("计算机");
        String s2 = s1.intern();
        String s3 = "计算机";
        System.out.println(s2);//计算机
        System.out.println(s1 == s2);//false，因为一个是堆内存中的 String 对象一个是常量池中的 String 对象，
    }


    private void demo30(){
        String s1 = new String("abc");// 这句话创建了几个字符串对象？
    }

}
