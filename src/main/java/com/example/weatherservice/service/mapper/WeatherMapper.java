package com.example.weatherservice.service.mapper;

import java.util.HashMap;
import com.example.weatherservice.model.Weather;
import com.example.weatherservice.model.dto.WeatherDto;
import com.example.weatherservice.service.CityService;
import com.example.weatherservice.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class WeatherMapper {
    private final WeatherService weatherService;
    private final CityService cityService;

    public WeatherDto mapToDto(Weather weather) {
        WeatherDto dto = new WeatherDto();
        dto.setCityName(weather.getCity().getName());
        dto.setTime(weather.getTime());
        HashMap<String, Double> coord = new HashMap<>();
        coord.put("lon", weather.getCity().getCoordinate().getLon());
        coord.put("lat", weather.getCity().getCoordinate().getLat());
        dto.setCoord(coord);
        HashMap<String, String> weatherProperties = new HashMap<>();
        weatherProperties.put("picture", weather.getIcon());
        weatherProperties.put("description", weather.getDescription());
        weatherProperties.put("name", weather.getMain());
        dto.setWeather(weatherProperties);
        return dto;
    }
}
