package com.example.weatherservice.service;

import java.util.List;
import com.example.weatherservice.model.City;

public interface CityService {
    City add(City city);

    City update(Long id, City city);

    List<City> get();

    Long delete(Long id);

    City findByName(String name);
}
