package com.yaazhtech.railwayManagement.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Railway")
public class RailwayDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable = false)
    private Long id;
    private String trainName;
    private String destination;
    private String departureTime;
    private Long availableSeats;


}
