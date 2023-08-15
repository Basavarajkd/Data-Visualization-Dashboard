package com.visualization.dashboard.controller;

import com.visualization.dashboard.payload.DataDTO;
import com.visualization.dashboard.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping
    public ResponseEntity<List<DataDTO>> getDataWithFilters(
            @RequestParam(required = false) Integer endYear,
            @RequestParam(required = false) List<String> topics,
            @RequestParam(required = false) String sector,
            @RequestParam(required = false) String region,
            @RequestParam(required = false) String pest,
            @RequestParam(required = false) String source,
            @RequestParam(required = false) String swot,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String city) {
        List<DataDTO> dataList = dataService.getDataWithFilters(endYear, topics, sector, region, pest, source, swot, country, city);
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }



}
