package org.example.services;

import java.util.List;

import org.example.data.entities.Article;

public interface ArticleService {
    void create(Article article);
    List<Article> findAll();
    Article searchByLibelle(String libelle);
}
