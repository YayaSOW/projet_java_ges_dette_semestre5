package org.example.services;

import org.example.data.entities.Article;
import org.example.data.repositories.list.ArticleRepositoryList;

import java.util.List;

public class ArticleServiceImp {
    private ArticleRepositoryList articleRepositoryList = new ArticleRepositoryList();

    public void create(Article article) {
        articleRepositoryList.insert(article);
    }

    public List<Article> findAll() {
        return articleRepositoryList.selectAll();
    }

    public Article searchByLibelle(String libelle) {
        return articleRepositoryList.selectByLibelle(libelle);
    }
}
