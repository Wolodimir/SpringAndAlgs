package com.learning.springandalgs.service;

import com.learning.springandalgs.algorithms.arraysSortAlgs.BubbleSort;
import org.springframework.stereotype.Service;

@Service
public class ArraysSortService {

    public Long bubbleSort(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return BubbleSort.sort(arr);
    }
}
