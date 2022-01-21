package com.example.weatherservice.service;

import java.util.List;
import com.example.weatherservice.model.Coordinate;

public interface CoordinateService {
    Coordinate add(Coordinate coordinate);

    Coordinate update(Long id, Coordinate coordinate);

    List<Coordinate> get();

    Long delete(Long id);
}
