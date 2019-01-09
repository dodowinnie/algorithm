package src.com.brandon.algorithm.insertsort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {15, 65, 44, 18, 2, 99, 32, 53, 72};
        System.out.println("排序前：" + Arrays.toString(nums));
        int length = nums.length;
        for(int i = 1; i < length; i++){
            int j = i - 1; // 插入的数组最大下标
            int insert = nums[i]; //要插入的数
            while(j >= 0 && nums[j] > insert){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = insert;
        }
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
