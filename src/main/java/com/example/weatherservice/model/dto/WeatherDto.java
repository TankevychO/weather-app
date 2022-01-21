package com.example.weatherservice.model.dto;

import java.util.HashMap;
import lombok.Data;

@Data
public class WeatherDto {
    private String cityName;
    private String time;
    private HashMap<String,  Double> coord;
    private HashMap<String,  String> weather;
}
