package org.example.data.entities;

import org.example.data.enums.Statut;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dette {
    private int id;
    private LocalDate date;
    private double montant;
    private double montantVerser;
    private double montantRestant;
    private static int nbrDette;

    //Navigabilite
    // ManyToOne (Dette => Client)
    private Client client;
    //OneToMany (Dette => Detail)
    private List<Detail> details = new ArrayList<>();
    //ManyToOne (Dette => Statut)
    private Statut statut;

    public Dette() {
        id = ++nbrDette;
    }

    public Dette(LocalDate date, double montant, double montantVerser, double montantRestant) {
        id = ++nbrDette;
        this.date = date;
        this.montant = montant;
        this.montantVerser = montantVerser;
        this.montantRestant = montantRestant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontantVerser() {
        return montantVerser;
    }

    public void setMontantVerser(double montantVerser) {
        this.montantVerser = montantVerser;
    }

    public double getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(double montantRestant) {
        this.montantRestant = montantRestant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void add(Detail detail) {
        this.details.add(detail);
    }

    @Override
    public String toString() {
        return "Dette [id=" + id + ", date=" + date + ", montant=" + montant + ", montantVerser=" + montantVerser + ", montantRestant=" + montantRestant + ", statut=" + statut + "]";
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }
}
