package com.learning.springandalgs.algorithms.arraysSortAlgs;

public class InsertionSort {
    public static long sort(int[] array) {
        long k = 0;
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
            k++;
        }
        return k;
    }
}
