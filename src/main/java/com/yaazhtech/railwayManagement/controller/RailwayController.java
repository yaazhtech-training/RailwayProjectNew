package com.yaazhtech.railwayManagement.controller;

import com.yaazhtech.railwayManagement.data.RailwayDetails;
import com.yaazhtech.railwayManagement.model.RailwayInfo;
import com.yaazhtech.railwayManagement.repositary.RailwayRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Controller
 */

@RestController
@RequestMapping("/demo")
public class RailwayController implements RailwayManagement {
    @Autowired
    RailwayRepo railwayRepo;
    @Override
    public String saveRailwayData(RailwayInfo railwayInfo)
    {
        RailwayDetails rail = new RailwayDetails();
        rail.setId(railwayInfo.getId());
        rail.setTrainName(railwayInfo.getTrainName());
        rail.setDestination(railwayInfo.getDestination());
        rail.setDepartureTime(railwayInfo.getDepartureTime());
        rail.setAvailableSeats(railwayInfo.getAvailableSeats());
        railwayRepo.save(rail);
        return "saved successfully";
    }
    @Override
    public List<RailwayDetails> getData()
    {
        return railwayRepo.findAll();
    }
    @Override
    public RailwayDetails getById(Long id)
    {
        return railwayRepo.findById(id).orElse(null);
    }
    @Override
    public RailwayDetails updateRailwayData(Long id,RailwayDetails updateRailwayData)
    {
        RailwayDetails updateData = railwayRepo.findById(id).orElse(null);
        updateData.setTrainName(updateRailwayData.getTrainName());
        updateData.setDestination(updateRailwayData.getDestination());
        return railwayRepo.save(updateData);
    }
    @Override
    public void deleteRailwayData(Long id)
    {
        railwayRepo.deleteById(id);
    }

}
