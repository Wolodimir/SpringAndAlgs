package com.learning.springandalgs.service;

import com.learning.springandalgs.algorithms.arraysSortAlgs.BubbleSort;
import com.learning.springandalgs.algorithms.arraysSortAlgs.InsertionSort;
import com.learning.springandalgs.algorithms.arraysSortAlgs.SelectionSort;
import com.learning.springandalgs.algorithms.arraysSortAlgs.ShellSort;
import com.learning.springandalgs.dto.WorkReportDto;
import org.springframework.stereotype.Service;

@Service
public class ArraysSortService {

    public WorkReportDto bubbleSort(int length) {
        int[] arr = createRandomArray(length);
        long startTime = System.currentTimeMillis();
        long swaps = BubbleSort.sort(arr);
        WorkReportDto report = new WorkReportDto();
        report.time = (System.currentTimeMillis() - startTime) / 1000;
        report.swaps = swaps; //make builder
        return report;
    }

    public WorkReportDto selectionSort(int length) {
        int[] arr = createRandomArray(length);
        long startTime = System.currentTimeMillis();
        long swaps = SelectionSort.sort(arr);
        WorkReportDto report = new WorkReportDto();
        report.time = (System.currentTimeMillis() - startTime) / 1000;
        report.swaps = swaps; //make builder
        return report;
    }

    public WorkReportDto insertionSort(int length) {
        int[] arr = createRandomArray(length);
        long startTime = System.currentTimeMillis();
        long swaps = InsertionSort.sort(arr);
        WorkReportDto report = new WorkReportDto();
        report.time = (System.currentTimeMillis() - startTime) / 1000;
        report.swaps = swaps; //make builder
        return report;
    }

    public WorkReportDto shellSort(int length) {
        int[] arr = createRandomArray(length);
        long startTime = System.currentTimeMillis();
        long swaps = ShellSort.sort(arr);
        WorkReportDto report = new WorkReportDto();
        report.time = (System.currentTimeMillis() - startTime) / 1000;
        report.swaps = swaps; //make builder
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
