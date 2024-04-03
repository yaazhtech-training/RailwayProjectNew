package com.yaazhtech.railwayManagement.model;

import com.yaazhtech.railwayManagement.data.RailwayDetails;
import lombok.Data;

@Data
public class RailwayInfo {
    private Long id;
    private String trainName;
    private String destination;
    private String departureTime;
    private Long availableSeats;

    private class Ttr
    {
        private Long id;
    }

    public void calculator()
    {

    }

}

