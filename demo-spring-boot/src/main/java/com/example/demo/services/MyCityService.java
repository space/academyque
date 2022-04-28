package com.example.demo.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.model.City;
import com.example.demo.model.Temperature;

import org.springframework.stereotype.Service;

@Service
public class MyCityService {

    private Map<Integer, City> mCities = new HashMap<>();

    public MyCityService() {

        System.out.println("Creata istanza MyCityService: " + this);

        mCities.put(1, new City(1L, "Italy", "Milano", 23, -23, new Temperature(25, "C°")));
        mCities.put(2, new City(2L, "Italy", "Bologna", 23, -23, new Temperature(25, "C°")));
        mCities.put(3, new City(3L, "Italy", "Torino", 23, -23, new Temperature(25, "C°")));
        mCities.put(4, new City(4L, "Italy", "Venezia", 23, -23, new Temperature(25, "C°")));
        mCities.put(5, new City(5L, "Italy", "Parma", 23, -23, new Temperature(25, "C°")));
        mCities.put(6, new City(6L, "Italy", "Naoli", 23, -23, new Temperature(25, "C°")));
    }

    public Collection<City> findAll() {
        return this.mCities.values();
    }

    public City findById(Integer id) {
        return this.mCities.get(id);
    }
}
