package com.learning.springandalgs.algorithms.arraysSortAlgs;

public class SelectionSort {

    public static void sort(int[] array) {
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    ind = j;
                }
                if (array.length - j == 1) {
                    int temp = array[i];
                    array[i] = array[ind];
                    array[ind] = temp;
                }
            }
        }
    }
}
