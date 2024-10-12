package org.example.core.factory.impl;

import org.example.core.factory.RepositoryFactory;
import org.example.core.services.YamlService;
import org.example.core.services.impl.YamlServiceImp;
import org.example.data.repositories.bd.ClientRepositoryBD;
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
    private YamlService yamlService = new YamlServiceImp();


    @Override
    public ClientRepository getInstanceClientRepository() {
        if (clientRepository == null) {
            // clientRepository = new ClientRepositoryList();
            // clientRepository = new ClientRepositoryBD();
            String type = yamlService.getDatabaseType();
            if ("LIST".equalsIgnoreCase(type)) {
                clientRepository = new ClientRepositoryList();
            } else if ("BD".equalsIgnoreCase(type)) {
                clientRepository = new ClientRepositoryBD();
            } else{
                System.out.println(type);
            }
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
