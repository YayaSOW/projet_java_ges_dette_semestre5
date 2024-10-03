package org.example.views;

import org.example.data.entities.Dette;
import org.example.data.enums.Statut;

public class DetteView extends View{
    public Dette saisi(){
        Dette dette = new Dette();
        System.out.println("Enter the date [DD/MM/YY]: ]");
        dette.setDate(formatDate(scanner.nextLine()));
        System.out.println("Enter the amount");
        dette.setMontant(scanner.nextDouble());
        System.out.println("Enter the montant Verser");
        dette.setMontantVerser(scanner.nextDouble());
        dette.setStatut(Statut.Encours);
        dette.setMontantRestant(dette.getMontant() - dette.getMontantVerser());
        return dette;
    }
}