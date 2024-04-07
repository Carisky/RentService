package com.org.cariski.rentservice.service.impl;

import com.org.cariski.rentservice.model.Rent;
import com.org.cariski.rentservice.repository.RentRepository;
import com.org.cariski.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService {
    @Autowired
    private RentRepository rentRepository;
    @Override
    public List<Rent> findAll() {
        return rentRepository.findAll();
    }

    @Override
    public Optional<Rent> findById(Long id) {
        return rentRepository.findById(id);
    }

    @Override
    public void save(Rent rent) {
        rentRepository.save(rent);
    }

    @Override
    public Rent update(Rent newRentData, Long id) {
        Rent existingRent = rentRepository.findById(id).orElse(null);
        if (existingRent != null) {
            existingRent.setStartDate(newRentData.getStartDate());
            existingRent.setEndDate(newRentData.getEndDate());
            existingRent.setClient(existingRent.getClient());
            existingRent.setApartment(existingRent.getApartment());
            return rentRepository.save(existingRent);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        rentRepository.deleteById(id);
    }
}
