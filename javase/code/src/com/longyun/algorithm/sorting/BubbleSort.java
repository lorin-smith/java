package com.longyun.algorithm.sorting;

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 对传递过来的整形数组进行冒泡排序
     *
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
