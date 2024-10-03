package org.example.core;

import org.example.data.entities.Client;

public interface ClientRepository extends Repository<Client> {
    Client selectByTelephone(String telephone);
}
