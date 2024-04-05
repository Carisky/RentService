package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {
    public List<Apartment> findAll();
    public Optional<Apartment> findById(Long id);
    public void save(Apartment apartment);
    public void deleteById(Long id);
}
