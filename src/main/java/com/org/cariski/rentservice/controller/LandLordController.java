package com.org.cariski.rentservice.controller;

import com.org.cariski.rentservice.model.LandLord;
import com.org.cariski.rentservice.service.LandLordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/landlords")
public class LandLordController {
    @Autowired
    private LandLordService landLordService;

    @GetMapping
    public ResponseEntity<List<LandLord>> getAll() {
        List<LandLord> landlords = landLordService.findAll();
        return new ResponseEntity<>(landlords, HttpStatus.OK);
    }
}
