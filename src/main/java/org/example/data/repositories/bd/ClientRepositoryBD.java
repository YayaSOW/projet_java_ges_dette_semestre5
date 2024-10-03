package org.example.data.repositories.bd;

import org.example.core.ClientRepository;
import org.example.data.entities.Client;

public class ClientRepositoryBD extends RepositoryBDImp<Client> implements ClientRepository {
    @Override
    public Client selectByTelephone(String telephone) {
        return null;
    }
}
