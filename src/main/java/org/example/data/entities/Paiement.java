package org.example.data.entities;

import java.time.LocalDate;

public class Paiement {
    private int id;
    private LocalDate date;
    private double montant;
    private static int nbrPaiement;
        //Navigabilite
    //ManyToOne (Paiement => Dette)
    private Dette dette;

    public Paiement(LocalDate date, double montant) {
        this.id = ++nbrPaiement;
        this.date = date;
        this.montant = montant;
    }

    public Paiement() {
        this.id = ++nbrPaiement;
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

    public static int getNbrPaiement() {
        return nbrPaiement;
    }

    public static void setNbrPaiement(int nbrPaiement) {
        Paiement.nbrPaiement = nbrPaiement;
    }

    public Dette getDette() {
        return dette;
    }

    public void setDette(Dette dette) {
        this.dette = dette;
    }

    @Override
    public String toString() {
        return "Paiement [id=" + id + ", date=" + date + ", montant=" + montant + ", dette=" + dette + "]";
    }

}
