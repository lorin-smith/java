package com.longyun.algorithm.sorting;

import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TestData.arrInts));
        System.out.println("---------------------------------");
        SelectionSort.sort(TestData.arrInts);
        System.out.println(Arrays.toString(TestData.arrInts));
    }
}
