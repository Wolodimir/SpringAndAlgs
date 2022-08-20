package com.learning.springandalgs.algorithms.arraysSortAlgs;

public class ShellSort {
    public static long sort(int[] array) {
        long k = 0;
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
                k++;
            }
        }
        return k;
    }
}