package com.sky.demo.review.algorithm;

import java.util.Arrays;

/**
 * 冒泡：加flag判断是否执行了交换，如果没有，结束循环
 * @author pengyu
 * @date 2021/3/22 14:40
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7,4,-2,19,13,6};
        System.out.println(Arrays.toString(new BubbleSort().sort(arr)));
    }


    public int[] sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean off = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j]>nums[j+1]){
                    // 交换
                    nums[j] = nums[j] + nums[j+1];
                    nums[j+1] = nums[j]-nums[j+1];
                    nums[j] = nums[j] - nums[j+1];
                    off = !off;
                }
            }
            if (off){
                break;
            }
        }
        return nums;
    }

}
