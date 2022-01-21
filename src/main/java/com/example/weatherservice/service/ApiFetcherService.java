package com.example.weatherservice.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import com.example.weatherservice.model.City;
import com.example.weatherservice.model.Coordinate;
import com.example.weatherservice.model.Weather;
import com.example.weatherservice.model.dto.ApiResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ApiFetcherService {
    public static final String TIME_PATTERN = "HH:mm:ss";
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(TIME_PATTERN);
    private final static String token = "6c01bbd693a8200df2a1c593f2f25ce2";
    private final HttpClient httpClient;
    private final WeatherService weatherService;
    private final CityService cityService;
    private final CoordinateService coordinateService;

    public void fetchWeatherInfo(String cityName) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q="
                + cityName + ",uk&appid=" + token;
        ApiResponseDto responseDto =
                httpClient.get(url, ApiResponseDto.class);
        Coordinate coordinate = new Coordinate(responseDto.getCoord().getLon(),
                responseDto.getCoord().getLat());
        coordinate = coordinateService.add(coordinate);
        City city = new City(responseDto.getName(), coordinate);
        city = cityService.add(city);
        Weather weather = new Weather(responseDto.getWeather().get(0).getMain(),
                responseDto.getWeather().get(0).getDescription(),
                responseDto.getWeather().get(0).getIcon(),
                city, LocalTime.now().format(formatter));
        weatherService.add(weather);
    }
}

