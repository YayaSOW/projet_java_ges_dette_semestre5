package org.example.data.entities;

import org.example.data.enums.Etat;

public class User {
    private int id;
    private String email;
    private String login;
    private String password;
    private static int nbrUser;

    //Navigabilite
    //OneToOne (User => Client)
    private Client client ;
    //ManyToOne (User => Etat)
    private Etat etat;

    public User() {
        id = ++nbrUser;
    }

    public User(String email, String login, String password, Etat etat) {
        id = ++nbrUser;
        this.email = email;
        this.login = login;
        this.password = password;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", login=" + login + ", password=" + password + ", etat=" + etat + "]";
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
