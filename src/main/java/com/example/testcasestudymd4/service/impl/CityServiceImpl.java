package com.example.testcasestudymd4.service.impl;

import com.example.testcasestudymd4.model.City;
import com.example.testcasestudymd4.repository.ICityRepository;
import com.example.testcasestudymd4.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    ICityRepository cityRepository;


    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public Object findAll() {
        return cityRepository.findAll();
    }
}

