package com.learning.springandalgs.algorithms.arraysSortAlgs;

public class InsertionSort {
    public static long sort(int[] array) {
        int in, out;
        long k = 0;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
            k++;
        }
        return k;
    }
}