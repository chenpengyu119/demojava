package com.sky.demo;

/**
 * @author pengyu
 * @date 2021/2/25 13:07
 */
public class DemoJudgeConflict {

    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 4;

        int j1 = 4;
        int j2 = 6;
        System.out.println(i1<=j2 && i2>=j1);
    }



}
