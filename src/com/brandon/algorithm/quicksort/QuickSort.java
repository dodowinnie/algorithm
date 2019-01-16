package src.com.brandon.algorithm.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {15, 65, 44, 18, 2, 99, 32, 53, 72};
        System.out.println("排序前：" + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("排序后：" + Arrays.toString(nums));
    }


    private static void quickSort(int[] array, int left, int right){
        int start = left; // 起始指针
        int end = right;// 结束指针
        int key = array[start]; // 参照值

        while(start < end){
            // 从后遍历，找到比参照值小的数
            while(key < array[end]){
                end--;
            }
            // 找到了与参照值交换位置
            if(start < end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
            }
            // 从前往后遍历，找到比参照值大的数
            while(key > array[start]){
                start++;
            }
            // 找到了，再次交换位置
            if(start < end){
                int temp = array[end];
                array[end] = array[start];
                array[start] = temp;
                end--;
            }
        }

        if(start > left){
            quickSort(array, left, start  - 1);
        }

        if (end < right){
            quickSort(array, end + 1, right);
        }

    }
}
