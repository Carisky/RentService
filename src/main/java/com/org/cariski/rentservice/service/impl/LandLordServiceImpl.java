package com.org.cariski.rentservice.service.impl;

import com.org.cariski.rentservice.model.LandLord;
import com.org.cariski.rentservice.repository.LandLordRepository;
import com.org.cariski.rentservice.service.LandLordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LandLordServiceImpl implements LandLordService {
    @Autowired
    private LandLordRepository landLordRepository;
    @Override
    public List<LandLord> findAll() {
        return landLordRepository.findAll();
    }

    @Override
    public Optional<LandLord> findById(Long id) {
        return landLordRepository.findById(id);
    }

    @Override
    public void save(LandLord landLord) {
        landLordRepository.save(landLord);
    }

    @Override
    public void deleteById(Long id) {
        landLordRepository.deleteById(id);
    }

    @Override
    public LandLord update(LandLord newLandLordData, Long id) {
        LandLord existingLandLord = landLordRepository.findById(id).orElse(null);
        if (existingLandLord != null) {
            existingLandLord.setName(newLandLordData.getName());
            existingLandLord.setPhone(newLandLordData.getPhone());
            existingLandLord.setAddress(newLandLordData.getAddress());
            return landLordRepository.save(existingLandLord);
        }
        return null;
    }
}
