package com.example.weatherservice.model.dto;

import java.util.List;
import com.example.weatherservice.model.Coordinate;
import com.example.weatherservice.model.Weather;
import lombok.Data;

@Data
public class ApiResponseDto {
    private Coordinate coord;
    private List<Weather> weather;
    private String name;
}
