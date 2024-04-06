package com.org.cariski.rentservice.service.impl;

import com.org.cariski.rentservice.model.Client;
import com.org.cariski.rentservice.repository.ClientRepository;
import com.org.cariski.rentservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client update(Client newClientData, Long id) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        if (existingClient != null) {
            existingClient.setName(newClientData.getName());
            existingClient.setPhone(newClientData.getPhone());
            existingClient.setAddress(newClientData.getAddress());
            return clientRepository.save(existingClient);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }
}
