package org.example.core;

import org.example.data.entities.Client;

import java.util.List;

public interface ClientService {
    void create(Client client);
    List<Client> findAll();
    Client search(String tel);
}
