package org.example.data.repositories.list.impl;

import org.example.core.repositories.impl.RepositoryListImp;
import org.example.data.entities.Article;
import org.example.data.repositories.list.ArticleRepository;

public class ArticleRepositoryList extends RepositoryListImp<Article> implements ArticleRepository {

    @Override
    public Article selectByLibelle(String libelle) {
        return list.stream().
                filter(article -> article.getLibelle().compareToIgnoreCase(libelle)==0).
                findFirst().orElse(null);
    }
}
