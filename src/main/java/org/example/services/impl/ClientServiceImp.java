package org.example.services.impl;

import org.example.data.entities.Client;
import org.example.data.repositories.list.ClientRepository;
import org.example.services.ClientService;

import java.util.List;

public class ClientServiceImp implements ClientService {
    private ClientRepository clientRepository;

    public ClientServiceImp(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public void create(Client client) {
        clientRepository.insert(client);
    }

    @Override
    public List<Client> findAll(){
        return clientRepository.selectAll();
    }

    @Override
    public Client search(String tel) {
        return clientRepository.selectByTelephone(tel);
    }
}
