package com.org.cariski.rentservice.controller;

import com.org.cariski.rentservice.model.Rent;
import com.org.cariski.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rents")
public class RentController {
    @Autowired
    private RentService rentService;

    @GetMapping
    public ResponseEntity<List<Rent>> getAll() {
        List<Rent> rents = rentService.findAll();
        return new ResponseEntity<>(rents, HttpStatus.OK);
    }
}
