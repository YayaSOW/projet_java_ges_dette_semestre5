package org.example.views;

import org.example.data.entities.Article;

import java.util.List;

public class ArticleView extends View{
    public Article saisi(){
        Article article = new Article();
        System.out.println("Enter the libelle");
        article.setLibelle(scanner.nextLine());
        System.out.println("Enter the article's price");
        article.setPrix(scanner.nextDouble());
        System.out.println("Enter the article's QteStock");
        article.setQteStock(scanner.nextInt());
        return article;
    }

    public void afficher(List <Article> articles){
        articles.forEach(System.out::println);
    }

    public void afficheDispo(List <Article> articles){
        articles.stream().
                filter(article -> article.getQteStock()!=0).forEach(System.out::println);
    }
}
