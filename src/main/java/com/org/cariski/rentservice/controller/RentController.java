package com.org.cariski.rentservice.controller;

import com.org.cariski.rentservice.model.Rent;
import com.org.cariski.rentservice.service.impl.RentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rents")
public class RentController {
    @Autowired
    private RentServiceImpl rentService;

    @GetMapping
    public ResponseEntity<List<Rent>> findAll() {
        List<Rent> rents = rentService.findAll();
        return new ResponseEntity<>(rents, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rent> create(@RequestBody Rent rentData) {
        rentService.save(rentData);
        return new ResponseEntity<>(rentData, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rent> update(@PathVariable Long id, @RequestBody Rent rentData) {
        Rent updatedRent = rentService.update(rentData, id);
        return new ResponseEntity<>(updatedRent, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
