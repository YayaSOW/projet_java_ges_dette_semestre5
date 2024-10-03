package org.example.data.entities;

public class Detail {
    private int id;
    private int qteVendu;
    private static int nbrDetail;

    //Navigabilite
    //ManyToOne (Detail => Dette)
    private Dette dette;
    //ManyToOne (Detail => Article)
    private Article article;

    public Detail() {
        id = ++nbrDetail;
    }

    public Detail(int qteVendu) {
        id = ++nbrDetail;
        this.qteVendu = qteVendu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQteVendu() {
        return qteVendu;
    }

    public void setQteVendu(int qteVendu) {
        this.qteVendu = qteVendu;
    }

    public Dette getDette() {
        return dette;
    }

    public void setDette(Dette dette) {
        this.dette = dette;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Detail [id=" + id + ", qteVendu=" + qteVendu + "]";
    }
}
