package com.example.weatherservice.dao;

import com.example.weatherservice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Long> {
    City findCityByName(String name);
}
