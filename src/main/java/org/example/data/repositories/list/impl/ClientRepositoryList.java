package org.example.data.repositories.list.impl;

import org.example.core.repositories.impl.RepositoryListImp;
import org.example.data.entities.Client;
import org.example.data.repositories.list.ClientRepository;

public class ClientRepositoryList extends RepositoryListImp<Client> implements ClientRepository {
    @Override
    public Client selectByTelephone(String telephone) {
       return list.stream().
                filter(client -> client.getTelephone().compareToIgnoreCase(telephone)==0).
                findFirst().orElse(null);
    }
}
