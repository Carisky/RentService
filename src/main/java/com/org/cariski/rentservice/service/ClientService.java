package com.org.cariski.rentservice.service;

import com.org.cariski.rentservice.model.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    public List<Client> findAll();
    public Optional<Client> findById(Long id);
    public void save(Client client);
    public void deleteById(Long id);
}
