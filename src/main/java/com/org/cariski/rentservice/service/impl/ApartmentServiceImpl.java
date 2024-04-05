package com.org.cariski.rentservice.service.impl;

import com.org.cariski.rentservice.model.Apartment;
import com.org.cariski.rentservice.repository.ApartmentRepository;
import com.org.cariski.rentservice.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public List<Apartment> findAll() {
        return apartmentRepository.findAll();
    }

    @Override
    public Optional<Apartment> findById(Long id) {
        return apartmentRepository.findById(id);
    }

    @Override
    public void save(Apartment apartment) {
        apartmentRepository.save(apartment);
    }

    @Override
    public void deleteById(Long id) {
        apartmentRepository.deleteById(id);
    }
}
