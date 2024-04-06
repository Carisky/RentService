package com.org.cariski.rentservice.controller;

import com.org.cariski.rentservice.model.Client;
import com.org.cariski.rentservice.service.ClientService;
import com.org.cariski.rentservice.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;

    public ClientController(ClientServiceImpl clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> clients = clientService.findAll();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client clientData) {
        clientService.save(clientData);
        return new ResponseEntity<>(clientData, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client clientData) {
        Client updatedClient = clientService.update(clientData, id);
        return new ResponseEntity<>(updatedClient, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clientService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
