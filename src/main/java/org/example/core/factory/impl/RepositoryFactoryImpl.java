package org.example.core.factory.impl;

import org.example.core.factory.RepositoryFactory;
import org.example.data.repositories.list.ArticleRepository;
import org.example.data.repositories.list.ClientRepository;
import org.example.data.repositories.list.DetteRepository;
import org.example.data.repositories.list.UserRepository;
import org.example.data.repositories.list.impl.ArticleRepositoryList;
import org.example.data.repositories.list.impl.ClientRepositoryList;
import org.example.data.repositories.list.impl.DetteRepositoryList;
import org.example.data.repositories.list.impl.UserRepositoryList;

public class RepositoryFactoryImpl implements RepositoryFactory {
    private ClientRepository clientRepository;
    private UserRepository userRepository;
    private ArticleRepository articleRepository;
    private DetteRepository detteRepository;

    @Override
    public ClientRepository getInstanceClientRepository() {
        if (clientRepository == null) {
            clientRepository = new ClientRepositoryList();
        }
        return clientRepository;
    }

    @Override
    public UserRepository getInstanceUserRepository() {
        if (userRepository == null) {
            userRepository = new UserRepositoryList();
        }
        return userRepository;
    }

    @Override
    public ArticleRepository getInstanceArticleRepository() {
        if (articleRepository == null) {
            articleRepository = new ArticleRepositoryList();
        }
        return articleRepository;
    }

    @Override
    public DetteRepository getInstanceDetteRepository() {
        if (detteRepository == null) {
            detteRepository = new DetteRepositoryList();
        }
        return detteRepository;
    }
}
