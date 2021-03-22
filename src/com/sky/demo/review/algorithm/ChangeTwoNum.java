package com.sky.demo.review.algorithm;

/**
 * 不借助临时变量，交换两个数的值
 * @author pengyu
 * @date 2021/3/22 14:24
 */
public class ChangeTwoNum {

    public static void main(String[] args) {
        new ChangeTwoNum().demoGetOrigin();

        new ChangeTwoNum().changeNum(2,3);
    }

    public void demoGetOrigin(){
        Integer origin = 1;
       getOrigin(origin);
        System.out.println(origin);
    }

    /**
     * 包装类的自动拆包
     * @param origin
     */
    public void getOrigin(Integer origin){
        origin = origin+1;
    }


    public void changeNum(int i, int j){
        i = i+j;
        j = i-j;
        i = i-j;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
