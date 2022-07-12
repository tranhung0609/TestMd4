package com.example.testcasestudymd4.service;

import com.example.testcasestudymd4.model.Country;

import java.util.Optional;

public interface ICountryService {


    Optional<Country> findById(Long id);

    Country save(Country country);

    void remove(Long id);

    Iterable<Country> findAllCountries();
}
