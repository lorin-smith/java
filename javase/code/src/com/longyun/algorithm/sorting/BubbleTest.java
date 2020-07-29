package com.longyun.algorithm.sorting;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TestData.arrInts));
        System.out.println("---------------------------------");
        BubbleSort.sort(TestData.arrInts);
        System.out.println(Arrays.toString(TestData.arrInts));
    }
}
