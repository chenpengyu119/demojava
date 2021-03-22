package com.sky.demo.review.algorithm;

/**
 * 阶乘
 * @author pengyu
 * @date 2021/3/22 13:28
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(new Factorial().getFac(3));
    }


    private int getFac(int ele){
        if (ele==1){
            return ele;
        }else{
            return ele*getFac(ele-1);
        }
    }
}
