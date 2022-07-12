package com.example.testcasestudymd4.service.impl;

import com.example.testcasestudymd4.model.Country;
import com.example.testcasestudymd4.repository.ICountryRepository;
import com.example.testcasestudymd4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    ICountryRepository countryRepository;


    @Override
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public void remove(Long id) {
        countryRepository.deleteById(id);
    }

    @Override
    public Iterable<Country> findAllCountries() {
        return countryRepository.findAll();
    }
}
