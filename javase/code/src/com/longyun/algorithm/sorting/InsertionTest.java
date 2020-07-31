package com.longyun.algorithm.sorting;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TestData.arrInts));
        InsertionSort.sort(TestData.arrInts);
        System.out.println(Arrays.toString(TestData.arrInts));
    }
}
