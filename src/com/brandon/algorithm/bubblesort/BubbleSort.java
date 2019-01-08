package com.brandon.algorithm.bubblesort;

import java.util.Arrays;

/**
 * Created by Brandoncui on 2019/1/8.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {15, 65, 44, 18, 2, 99, 32, 53, 72};
        System.out.println("排序前：" + Arrays.toString(nums));
        int length = nums.length;
        for(int i = 1; i < length; i++){
            for(int j = 0; j < length - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
