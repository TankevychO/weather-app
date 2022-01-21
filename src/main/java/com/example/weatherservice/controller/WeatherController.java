package com.example.weatherservice.controller;

import com.example.weatherservice.model.City;
import com.example.weatherservice.model.dto.WeatherDto;
import com.example.weatherservice.service.ApiFetcherService;
import com.example.weatherservice.service.CityService;
import com.example.weatherservice.service.WeatherService;
import com.example.weatherservice.service.mapper.WeatherMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;
    private final CityService cityService;
    private final ApiFetcherService apiFetcherService;
    private final WeatherMapper weatherMapper;

    @GetMapping("/by-city")
    WeatherDto getByCity(@RequestParam String name) {
        apiFetcherService.fetchWeatherInfo(name);
        City city = cityService.findByName(name);
        return weatherMapper.mapToDto(weatherService.findByCity(city.getId()));
    }
}
