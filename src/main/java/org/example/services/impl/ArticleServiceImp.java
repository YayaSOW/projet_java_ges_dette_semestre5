package org.example.services.impl;

import org.example.data.entities.Article;
import org.example.data.repositories.list.impl.ArticleRepositoryList;
import org.example.services.ArticleService;

import java.util.List;

public class ArticleServiceImp implements ArticleService {
    private ArticleRepositoryList articleRepositoryList = new ArticleRepositoryList();

    @Override
    public void create(Article article) {
        articleRepositoryList.insert(article);
    }

    @Override
    public List<Article> findAll() {
        return articleRepositoryList.selectAll();
    }

    @Override
    public Article searchByLibelle(String libelle) {
        return articleRepositoryList.selectByLibelle(libelle);
    }
}
