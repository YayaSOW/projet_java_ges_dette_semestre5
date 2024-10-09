package org.example.data.repositories.list;

import org.example.core.repositories.Repository;
import org.example.data.entities.Client;

public interface ClientRepository extends Repository<Client> {
    Client selectByTelephone(String telephone);
}
