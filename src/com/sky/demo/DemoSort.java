package com.sky.demo;

import com.sky.demo.vo.Student;
import sun.dc.pr.PRError;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author pengyu
 * @date 2020/5/21 4:25 下午
 */
public class DemoSort {

    public static void main(String[] args) {

        demo5();
    }

    private static void demo3(){
        Student st1 = new Student();
        st1.setName("0");
        Student st2 = new Student();
        st2.setName("1");
        Student st3 = new Student();
        st3.setName("1");
        Student st4 = new Student();
        st4.setName("0");

        List<Student> list = new ArrayList<>();
        list.add(st2);
        list.add(st1);
        list.add(st3);
        list.add(st4);
        List<Student> collect = list.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
        for (Student student : collect) {
            System.out.println(student.getName());
        }
    }

    private static void demo1(){
        List<String> ls = Arrays.asList("1","6","2","4","3","5","7");
        ls = ls.stream().filter(p->{
            return Integer.parseInt(p)>4;
        }).sorted(Comparator.comparing(p->p)).collect(Collectors.toList());
        for (String l : ls) {
            System.out.print(l+"--");
        }
    }

    private static void demo2(){
        List<String> date = new ArrayList<>();
        date.add("07:12");
        date.add("08:39");
        date.add("06:12");
        date = date.stream().sorted(Comparator.comparing(Function.identity())).collect(Collectors.toList());
        System.out.println(date.toString());
    }


    private static void demo4(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> collect = list.stream().filter(single -> Objects.equals(single, 2)
                || Objects.equals(3, single)).collect(Collectors.toList());
        list.removeAll(collect);
        list.addAll(collect);
        System.out.println(list);
    }

    /**
     * 字符串如果包含数字，数字按照大小顺序排序
     */
     static final Pattern p = Pattern.compile("[0-9]");

    private static void demo5(){
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("11");
        list.add("6");
        list.add("C4");
        list.add("C3");
        list.add("3");
        list.add("41C");
        List<String> numList = list.stream().filter(single-> p.matcher(single).matches()).collect(Collectors.toList());
        list.removeAll(numList);
        numList = numList.stream().sorted(Comparator.comparing(single->{

            // 获取String中的数字
            String numbers = getNumbers(single);
            return Integer.parseInt(numbers);
        })).collect(Collectors.toList());
        list.sort(Comparator.comparing(String::toString));
        List<String> newList = new ArrayList<>();
        newList.addAll(numList);
        newList.addAll(list);
        System.out.println(newList);
    }

    private static final Pattern pattern = Pattern.compile("\\d+");

    //截取数字
    public static String getNumbers(String content) {

        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            return matcher.group(0);
        }
        return "";
    }
}
