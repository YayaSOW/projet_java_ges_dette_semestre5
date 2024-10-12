package org.example.core.factory;

import org.example.core.views.View;
import org.example.core.views.impl.ArticleViewImpl;
import org.example.data.entities.Client;
import org.example.data.entities.Dette;
import org.example.data.entities.User;

public interface ViewFactory {
    View<Client> getInstanceClientView();
    View<User> getInstanceUserView();
    ArticleViewImpl getInstanceArticleView();
    View<Dette> getInstanceDetteView();
}
