package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.LandLord;

import java.util.List;
import java.util.Optional;

public interface LandLordService {
    List<LandLord> findAll();
    Optional<LandLord> findById(Long id);
    void save(LandLord landLord);
    void deleteById(Long id);

    LandLord update(LandLord newLandLordData, Long id);
}
