package com.learning.springandalgs.controller;

import com.learning.springandalgs.service.ArraysSortService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sort")
public class ArraysSortController {

    private ArraysSortService arraysSortService;

    public ArraysSortController(ArraysSortService arraysSortService) {
        this.arraysSortService = arraysSortService;
    }

    @PostMapping("/bubble")
    public String bubbleSort(@RequestParam Integer length) {
        return arraysSortService.bubbleSort(length).toString();
    }
}
