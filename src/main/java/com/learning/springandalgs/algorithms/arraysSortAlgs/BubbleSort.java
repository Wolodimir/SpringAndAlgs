package com.learning.springandalgs.algorithms.arraysSortAlgs;

public class BubbleSort {

    public static long sort(int[] array) {
        long k = 0;
        for(int out = array.length - 1; out > 1; out --) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in + 1];
                    array[in + 1] = array[in];
                    array[in] = temp;
                    k++;
                }
            }
        }
        return k;
    }

}
