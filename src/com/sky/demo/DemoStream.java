package com.sky.demo;

import com.sky.demo.vo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author pengyu
 * @date 2020/6/18 11:25 上午
 */
public class DemoStream {

    public static void main(String[] args) {

        //demo1();
        demo2();
    }

    private static void  demo1(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("5");
        list.add("4");
        list.add("5");
        list = list.stream().filter(str->{
            return "5".equals(str);
        }).collect(Collectors.toList());
        System.out.println(list.size());
    }

    private static void demo2(){
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        students.add(student);
        Map<String, String> collect = students.stream().collect(Collectors.toMap(Student::getName, Student::getName));
        for (Map.Entry<String, String> stringStudentEntry : collect.entrySet()) {
            System.out.println(stringStudentEntry.getValue());
        }
    }
}
