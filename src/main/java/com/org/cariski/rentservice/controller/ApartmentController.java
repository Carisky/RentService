package com.org.cariski.rentservice.controller;

import com.org.cariski.rentservice.model.Apartment;
import com.org.cariski.rentservice.service.impl.ApartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    @Autowired
    private ApartmentServiceImpl apartmentService;

    @GetMapping
    public ResponseEntity<List<Apartment>> findAll() {
        List<Apartment> apartments = apartmentService.findAll();
        return new ResponseEntity<>(apartments, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Apartment> create(@RequestBody Apartment apartmentData) {
        apartmentService.save(apartmentData);
        return new ResponseEntity<>(apartmentData, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Apartment> update(@PathVariable Long id, @RequestBody Apartment apartmentData) {
        Apartment updatedApartment = apartmentService.update(apartmentData, id);
        return new ResponseEntity<>(updatedApartment, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        apartmentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
