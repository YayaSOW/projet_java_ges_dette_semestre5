package org.example.data.repositories.list;

import org.example.data.entities.Article;

public class ArticleRepositoryList extends RepositoryListImp<Article> {

    public Article selectByLibelle(String libelle) {
        return list.stream().
                filter(article -> article.getLibelle().compareToIgnoreCase(libelle)==0).
                findFirst().orElse(null);
    }
}
