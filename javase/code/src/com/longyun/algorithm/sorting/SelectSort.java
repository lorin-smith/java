package com.longyun.algorithm.sorting;

/**
 * 选择排序
 * 首先从未排序的序列中找到最小（大）值放到首位，然后，从剩余的未排序中找最小（大）值放在已排序的末尾，
 * 以此类推，直到序列的尾部。
 * 注意：
 *     每次循环只交换一次值，记录的是下标的值
 */
public class SelectSort {
    /**
     * @param arr 整形数组
     */
    public static void sort(int[] arr) {
//        可以实现结果，但交换次数太多
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int t = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = t;
//                }
//            }
//        }
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[index];
            arr[index] = t;
        }
    }
}
