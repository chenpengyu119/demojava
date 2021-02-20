package com.sky.demo;

import com.sky.demo.vo.Student;
import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author pengyu
 * @date 2020/7/17 1:39 下午
 */
public class DemoMap {
    public static void main(String[] args) {
        demoPutAll();
    }

    private static void demo010(){
        Map<String,String> map = new HashMap<>();
        System.out.println(map.put("ss","ss"));
        map.put("ss","11");
        System.out.println(map.get("ss"));
    }

    private static void demoGetNull(){
        Map<String,String> map = new HashMap<>();
        System.out.println(map.get(null));
    }

    private static void demoNullKey(){
        Map<String,String> map = new HashMap<>();
        map.put(null,"1");
    }

    private static void putIn(){
        List<String> list1 = new ArrayList<>();

        String str1 = "";
        String str2 = "sisi";
        {
            if (!"".equals(str1)) {
                list1.add(str1);
            }
            if (!"".equals(str2)) {
                list1.add(str2);
            }
        }
        System.out.println(list1.size());
    }

    private static void demoPutAll(){
        Student student1 = new Student();student1.setName("s");
        Student student2 = new Student();student2.setName("s");
        List<Student> students = new ArrayList<>();
        students.add(student2);
        students.add(student1);
        Map<String, String> map = students.stream().collect(HashMap::new, (m,v)->{
            m.put(v.getName(), v.getName());
        }, HashMap::putAll);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
