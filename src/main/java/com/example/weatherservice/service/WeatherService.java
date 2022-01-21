package com.example.weatherservice.service;

import java.util.List;
import com.example.weatherservice.model.Weather;

public interface WeatherService {
    Weather add(Weather weather);

    Weather update(Long id, Weather weather);

    List<Weather> get();

    Long delete(Long id);

    Weather findByCity(Long id);
}
