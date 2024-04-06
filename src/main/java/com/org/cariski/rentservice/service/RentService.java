package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.Rent;

import java.util.List;
import java.util.Optional;

public interface RentService {
    List<Rent> findAll();
    Optional<Rent> findById(Long id);
    void save(Rent rent);

    Rent update(Rent newRentData, Long id);

    void deleteById(Long id);
}
