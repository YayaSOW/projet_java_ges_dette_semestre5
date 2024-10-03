package org.example.data.entities;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private int id;
    private String libelle;
    private double prix;
    private int qteStock;
    private static int nbrArticles;

    //Navigabilite
    //OneToMany (Article => Detail)
    private List<Detail> details = new ArrayList<>();
    public Article() {
        id = ++nbrArticles;
    }
    public Article(String libelle, double prix, int qteStock) {
        id = ++nbrArticles;
        this.libelle = libelle;
        this.prix = prix;
        this.qteStock = qteStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQteStock() {
        return qteStock;
    }

    public void setQteStock(int qteStock) {
        this.qteStock = qteStock;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void add(Detail detail) {
        this.details.add(detail);
    }

    @Override
    public String toString() {
        return "Article [id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", qteStock=" + qteStock + "]";
    }
}
