package com.example.weatherservice.service.impl;

import java.util.List;
import com.example.weatherservice.dao.CityDao;
import com.example.weatherservice.model.City;
import com.example.weatherservice.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityDao cityDao;

    @Override
    public City add(City city) {
        return cityDao.save(city);
    }

    @Override
    public City update(Long id, City city) {
        return cityDao.save(new City(id, city.getName(),
                city.getCoordinate()));
    }

    @Override
    public List<City> get() {
        return cityDao.findAll();
    }

    @Override
    public Long delete(Long id) {
        cityDao.deleteById(id);
        return id;
    }

    @Override
    public City findByName(String name) {
        return cityDao.findCityByName(name);
    }
}
