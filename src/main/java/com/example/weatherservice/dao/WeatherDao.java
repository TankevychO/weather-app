package com.example.weatherservice.dao;

import com.example.weatherservice.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WeatherDao extends JpaRepository<Weather, Long> {
    @Query("SELECT w FROM Weather w "
            + "join fetch w.city c "
            + "WHERE c.id = ?1")
    Weather findByCity(Long id);
}
