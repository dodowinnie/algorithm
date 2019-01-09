package src.com.brandon.algorithm.selectsort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] nums = {15, 65, 44, 18, 2, 99, 32, 53, 72};
        System.out.println("排序前：" + Arrays.toString(nums));
        int length = nums.length;
        int index; // 最小元素的下标
        for(int i = 0; i < length; i++){
            index = i;
            for(int j = i + 1; j < length; j++){
                if(nums[index] > nums[j]){
                    index = j;
                }
            }
             int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
