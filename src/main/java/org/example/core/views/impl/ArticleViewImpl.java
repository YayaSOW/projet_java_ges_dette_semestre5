package org.example.core.views.impl;

import java.util.List;

import org.example.core.views.View;
import org.example.data.entities.Article;

public interface ArticleViewImpl extends View<Article> {
    void afficheDispo(List <Article> articles);
}
