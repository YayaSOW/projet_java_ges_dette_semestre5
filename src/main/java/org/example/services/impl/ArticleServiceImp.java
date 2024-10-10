package org.example.services.impl;

import org.example.data.entities.Article;
import org.example.data.repositories.list.ArticleRepository;
import org.example.services.ArticleService;

import java.util.List;

public class ArticleServiceImp implements ArticleService {
    private ArticleRepository articleRepository;

    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public void create(Article article) {
        articleRepository.insert(article);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.selectAll();
    }

    @Override
    public Article searchByLibelle(String libelle) {
        return articleRepository.selectByLibelle(libelle);
    }
}
