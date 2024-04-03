package com.yaazhtech.railwayManagement.controller;

import com.yaazhtech.railwayManagement.data.RailwayDetails;
import com.yaazhtech.railwayManagement.model.RailwayInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    public interface RailwayManagement {
    @PostMapping("/save")
    public String saveRailwayData(@RequestBody RailwayInfo railwayInfo);

    @GetMapping("/getInfo")
    public List<RailwayDetails> getData();

    @GetMapping("/{id}")
    public RailwayDetails getById(@PathVariable Long id);

    @PutMapping("/{id}")
    public RailwayDetails updateRailwayData(@PathVariable Long id,@RequestBody RailwayDetails updateRailwayData);

    @DeleteMapping("/{id}")
        public void deleteRailwayData(@PathVariable Long id);

}
