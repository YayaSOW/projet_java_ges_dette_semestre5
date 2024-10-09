package org.example.data.repositories.list;

import org.example.core.repositories.Repository;
import org.example.data.entities.Article;

public interface ArticleRepository extends Repository<Article> {
    Article selectByLibelle(String libelle);
}
