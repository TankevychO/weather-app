package com.example.weatherservice.dao;

import com.example.weatherservice.model.Coordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateDao extends JpaRepository<Coordinate, Long> {
}
