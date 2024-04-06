package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    List<Apartment> findAll();
    Optional<Apartment> findById(Long id);
    void save(Apartment apartment);
    void deleteById(Long id);
    Apartment update(Apartment newApartmentData, Long id);
}
