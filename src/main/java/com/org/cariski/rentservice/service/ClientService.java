package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> findAll();
    Optional<Client> findById(Long id);
    void save(Client client);
    Client update(Client client,Long id);
    void deleteById(Long id);
}
