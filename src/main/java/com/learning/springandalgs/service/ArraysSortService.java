package com.learning.springandalgs.service;

import com.learning.springandalgs.algorithms.arraysSortAlgs.BubbleSort;
import com.learning.springandalgs.algorithms.arraysSortAlgs.SelectionSort;
import com.learning.springandalgs.dto.WorkReportDto;
import org.springframework.stereotype.Service;

@Service
public class ArraysSortService {

    public Long bubbleSort(int length) {
        int[] arr = createRandomArray(length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        long startTime = System.currentTimeMillis();
        long swaps = BubbleSort.sort(arr);
        System.out.println((System.currentTimeMillis() - startTime) / 1000);
        return swaps;
    }

    public WorkReportDto selectionSort(int length) {
        int[] arr = createRandomArray(length);
        long startTime = System.currentTimeMillis();
        long swaps = SelectionSort.sort(arr);
        System.out.println((System.currentTimeMillis() - startTime) / 1000);
        WorkReportDto report = new WorkReportDto();
        report.time = 0L;
        return report;
    }

    private int[] createRandomArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }
}
