package org.example.data.repositories.bd;

import org.example.data.entities.Client;
import org.example.data.repositories.list.ClientRepository;

public class ClientRepositoryBD extends RepositoryBDImp<Client> implements ClientRepository {
    @Override
    public Client selectByTelephone(String telephone) {
        return null;
    }
}
