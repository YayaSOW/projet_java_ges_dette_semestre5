package org.example.core.factory;

import org.example.data.repositories.list.ArticleRepository;
import org.example.data.repositories.list.ClientRepository;
import org.example.data.repositories.list.DetteRepository;
import org.example.data.repositories.list.UserRepository;

public interface RepositoryFactory {
    ClientRepository getInstanceClientRepository() ;
    UserRepository getInstanceUserRepository();
    ArticleRepository getInstanceArticleRepository();
    DetteRepository getInstanceDetteRepository();
}
