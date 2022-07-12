package com.example.testcasestudymd4.service;

import com.example.testcasestudymd4.model.City;

import java.util.Optional;

public interface ICityService {

    Optional<City> findById(Long id);

    City save(City city);

    void remove(Long id);

    Object findAll();
}
