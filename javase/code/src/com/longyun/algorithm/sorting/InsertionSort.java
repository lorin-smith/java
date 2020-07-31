package com.longyun.algorithm.sorting;

/**
 * 插入排序
 * 1、取已排序的序列下一个元素作为要插入的新元素（从第二个取，第一个认为是已排序的）
 * 2、从后往前遍历已排序的序列，比较当前元素和新元素的大小关系
 * 3、如果当前元素和新元素的大小关系不正确，将该元素移到下一位，否则将新元素插入到该元素的下一位
 * 4、重复1、2、3的操作。
 */
public class InsertionSort {
    /**
     * @param arr 整形数组
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            int value = arr[i + 1];
            while (index >= 0 && value < arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = value;
        }
    }
}
