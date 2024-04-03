package com.yaazhtech.railwayManagement.repositary;

import com.yaazhtech.railwayManagement.data.RailwayDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RailwayRepo extends JpaRepository<RailwayDetails,Long>
{
}
