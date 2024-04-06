package com.org.cariski.rentservice.controller;

import com.org.cariski.rentservice.model.LandLord;
import com.org.cariski.rentservice.service.impl.LandLordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/landlords")
public class LandLordController {
    @Autowired
    private LandLordServiceImpl landLordService;

    @GetMapping
    public ResponseEntity<List<LandLord>> findAll() {
        List<LandLord> landlords = landLordService.findAll();
        return new ResponseEntity<>(landlords, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<LandLord> create(@RequestBody LandLord landLordData) {
        landLordService.save(landLordData);
        return new ResponseEntity<>(landLordData, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LandLord> update(@PathVariable Long id, @RequestBody LandLord landLordData) {
        LandLord updatedLandLord = landLordService.update(landLordData, id);
        return new ResponseEntity<>(updatedLandLord, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        landLordService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
