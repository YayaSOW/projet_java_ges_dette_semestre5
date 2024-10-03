package org.example.services;

import org.example.core.ClientRepository;
import org.example.core.ClientService;
import org.example.data.entities.Client;
import org.example.data.repositories.list.ClientRepositoryList;

import java.util.List;

public class ClientServiceImp implements ClientService {
    private ClientRepository clientRepositoryList;

    public ClientServiceImp(ClientRepository clientRepositoryList){
        this.clientRepositoryList = clientRepositoryList;
    }

    @Override
    public void create(Client client) {
        clientRepositoryList.insert(client);
    }

    @Override
    public List<Client> findAll(){
        return clientRepositoryList.selectAll();
    }

    @Override
    public Client search(String tel) {
        return clientRepositoryList.selectByTelephone(tel);
    }
}
