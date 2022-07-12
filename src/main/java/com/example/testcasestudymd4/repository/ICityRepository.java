package com.example.testcasestudymd4.repository;

import com.example.testcasestudymd4.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {
    void deleteAllByCountry_Id(Long id);
}

