package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.LandLord;

import java.util.List;
import java.util.Optional;

public interface LandLordService {
    public List<LandLord> findAll();
    public Optional<LandLord> findById(Long id);
    public void save(LandLord landLord);
    public void deleteById(Long id);
}
