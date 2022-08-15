package com.learning.springandalgs.controller;

import com.learning.springandalgs.dto.WorkReportDto;
import com.learning.springandalgs.service.ArraysSortService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sort")
public class ArraysSortController {

    private final ArraysSortService arraysSortService;

    public ArraysSortController(ArraysSortService arraysSortService) {
        this.arraysSortService = arraysSortService;
    }

    @PostMapping("/bubble")
    public WorkReportDto bubbleSort(@RequestParam Integer length) {
        return arraysSortService.bubbleSort(length);
    }

    @PostMapping("/selection")
    public WorkReportDto selectionSort(@RequestParam Integer length) {
        return arraysSortService.selectionSort(length);
    }

    @PostMapping("/insertion")
    public WorkReportDto insertionSort(@RequestParam Integer length) {
        return arraysSortService.insertionSort(length);
    }
}
