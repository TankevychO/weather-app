package com.example.weatherservice.service.impl;


import java.util.List;
import com.example.weatherservice.dao.WeatherDao;
import com.example.weatherservice.model.Weather;
import com.example.weatherservice.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WeatherServiceImpl implements WeatherService {
    private final WeatherDao weatherDao;

    @Override
    public Weather add(Weather weather) {
        return weatherDao.save(weather);
    }

    @Override
    public Weather update(Long id, Weather weather) {
        return weatherDao.save(new Weather(id, weather.getMain(),
                weather.getDescription(),
                weather.getIcon(), weather.getCity(), weather.getTime()));
    }

    @Override
    public List<Weather> get() {
        return weatherDao.findAll();
    }

    @Override
    public Long delete(Long id) {
        weatherDao.deleteById(id);
        return id;
    }

    @Override
    public Weather findByCity(Long id) {
        return weatherDao.findByCity(id);
    }
}
