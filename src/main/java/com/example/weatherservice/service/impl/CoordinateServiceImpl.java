package com.example.weatherservice.service.impl;

import java.util.List;
import com.example.weatherservice.dao.CoordinateDao;
import com.example.weatherservice.model.Coordinate;
import com.example.weatherservice.service.CoordinateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CoordinateServiceImpl  implements CoordinateService {
    private final CoordinateDao coordinateDao;
    @Override
    public Coordinate add(Coordinate coordinate) {
        return coordinateDao.save(coordinate);
    }

    @Override
    public Coordinate update(Long id, Coordinate coordinate) {
        return coordinateDao.save(new Coordinate(id, coordinate.getLon(), coordinate.getLat()));
    }

    @Override
    public List<Coordinate> get() {
        return coordinateDao.findAll();
    }

    @Override
    public Long delete(Long id) {
        coordinateDao.deleteById(id);
        return id;
    }
}
