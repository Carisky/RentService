package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.Rent;

import java.util.List;
import java.util.Optional;

public interface RentService {
    public List<Rent> findAll();
    public Optional<Rent> findById(Long id);
    public void save(Rent rent);
    public void deleteById(Long id);
}
