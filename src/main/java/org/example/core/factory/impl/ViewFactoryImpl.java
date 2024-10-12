package org.example.core.factory.impl;

import org.example.core.factory.ViewFactory;
import org.example.core.views.View;
import org.example.core.views.impl.ArticleViewImpl;
import org.example.data.entities.Client;
import org.example.data.entities.Dette;
import org.example.data.entities.User;
import org.example.views.ArticleView;
import org.example.views.ClientView;
import org.example.views.DetteView;
import org.example.views.UserView;

public class ViewFactoryImpl implements ViewFactory {
    private View<Client> clientView;
    private View<User> userView;
    private ArticleViewImpl articleView;
    private View<Dette> detteView;

    @Override
    public View<Client> getInstanceClientView() {
        if (clientView == null) {
            clientView = new ClientView();
        }
        return clientView;
    }

    @Override
    public View<User> getInstanceUserView() {
        if (userView == null) {
            userView = new UserView();
        }
        return userView;
    }

    @Override
    public ArticleViewImpl getInstanceArticleView() {
        if (articleView == null) {
            articleView = new ArticleView();
        }
        return articleView;
    }

    @Override
    public View<Dette> getInstanceDetteView() {
        if (detteView == null) {
            detteView = new DetteView();
        }
        return detteView;
    }

}
