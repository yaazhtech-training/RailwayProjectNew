package com.yaazhtech.railwayManagement.controller;

import com.yaazhtech.railwayManagement.data.RailwayDetails;

public interface RailwayApp {
    public String ticketBooking(Long id, String trainName, RailwayDetails railwayDetails);

}
