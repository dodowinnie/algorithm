package src.com.brandon.algorithm.shellsort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] nums = {15, 65, 44, 18, 2, 99, 32, 53, 72};
        System.out.println("排序前：" + Arrays.toString(nums));
        int length = nums.length;
        for (int gap = length / 2; gap >= 1; gap = gap / 2){
            for (int j = gap; j < length; j++){
                int k = nums[j];
                int i = j - gap;
                while(i >=0 && k < nums[i]){
                    nums[i + gap] = nums[i];
                    i = i - gap;
                }
                nums[i + gap] = k;
            }
        }
        System.out.println("排序后：" + Arrays.toString(nums));
    }
}
