package com.longyun.algorithm.sorting;

/**
 * 冒泡排序
 * 1、比较相邻的两个值
 * 2、如果大小关系不对，交换两个值
 * 3、重复1和2，直到到达数组的末尾
 * 4、数组的末尾向前移动一位，重复1、2、3，直到数组的末尾为1
 */
public class BubbleSort {
    /**
     * @param arr 整形数组
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
