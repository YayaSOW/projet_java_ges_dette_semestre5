package org.example.core.factory.impl;

import org.example.core.factory.RepositoryFactory;
import org.example.core.factory.ServiceRepository;
import org.example.services.ArticleService;
import org.example.services.ClientService;
import org.example.services.DetteService;
import org.example.services.UserService;
import org.example.services.impl.ArticleServiceImp;
import org.example.services.impl.ClientServiceImp;
import org.example.services.impl.DetteServiceImp;
import org.example.services.impl.UserServiceImp;

public class ServiceFactoryImpl implements ServiceRepository {
    private ClientService clientService;
    private UserService userService;
    private ArticleService articleService;
    private DetteService detteService;
    private RepositoryFactory repositoryFactory = new RepositoryFactoryImpl();

    @Override
    public ClientService getInstanceClientService(){
        if (clientService == null) {
            clientService = new ClientServiceImp(repositoryFactory.getInstanceClientRepository());
        }
        return clientService;
    }

    @Override
    public UserService getInstanceUserService(){
        if (userService == null) {
            userService = new UserServiceImp(repositoryFactory.getInstanceUserRepository());
        }
        return userService;
    }

    @Override
    public ArticleService getInstanceArticleService(){
        if (articleService == null) {
            articleService = new ArticleServiceImp(repositoryFactory.getInstanceArticleRepository());
        }
        return articleService;
    }

    @Override
    public DetteService getInstanceDetteService(){
        if (detteService == null) {
            detteService = new DetteServiceImp(repositoryFactory.getInstanceDetteRepository());
        }
        return detteService;
    }
}
