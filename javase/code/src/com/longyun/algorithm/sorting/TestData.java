package com.longyun.algorithm.sorting;

import java.util.Arrays;
import java.util.Random;

public class TestData {
    public static final int[] arrInts = new Random().ints(10, 0, 100).toArray();

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrInts));
    }
}
