package org.example.core.factory;

import org.example.services.ArticleService;
import org.example.services.ClientService;
import org.example.services.DetteService;
import org.example.services.UserService;

public interface ServiceFactory {
    ClientService getInstanceClientService();
    UserService getInstanceUserService();
    ArticleService getInstanceArticleService();
    DetteService getInstanceDetteService();
}
