package org.example.views.boutiquier;

import java.util.List;
import java.util.Scanner;

import org.example.core.views.View;
import org.example.core.views.impl.ArticleViewImpl;
import org.example.data.entities.Client;
import org.example.data.entities.Dette;
import org.example.data.entities.User;
import org.example.services.ArticleService;
import org.example.services.ClientService;
import org.example.services.DetteService;
import org.example.services.UserService;

public class BoutiquierView {
    private final View<Client> clientView;
    private final ClientService clientServiceImp;
    private final View<User> userView;
    private final UserService userServiceImp;
    private final ArticleViewImpl articleView;
    private final ArticleService articleServiceImp;
    private final View<Dette> detteView;
    private final DetteService detteServiceImp;
    private final Scanner scanner;

    public BoutiquierView(ClientService clientServiceImp, View<Client> clientView, View<User> userView,
    ArticleViewImpl articleView, View<Dette> detteView, UserService userServiceImp,
            ArticleService articleServiceImp, DetteService detteServiceImp, Scanner scanner) {
        this.scanner = scanner;
        this.clientServiceImp = clientServiceImp;
        this.clientView = clientView;
        this.userView = userView;
        this.articleView = articleView;
        this.detteView = detteView;
        this.userServiceImp = userServiceImp;
        this.articleServiceImp = articleServiceImp;
        this.detteServiceImp = detteServiceImp;
    }
    public void boutiquierRole() {
        int choice;
        do {
            choice = boutiquierMenu();
            switch (choice) {
                case 1 -> {
                    scanner.nextLine();
                    Client client = clientView.saisi();
                    User user = null;
                    System.out.println("Voulez vous voulez vous creer un user O/N ?");
                    String rep = String.valueOf(scanner.next().charAt(0));
                    if (rep.compareToIgnoreCase("o") == 0) {
                        scanner.nextLine();
                        user = userView.saisi();
                        userServiceImp.create(user);
                        user.setClient(client);
                        client.setUser(user);
                    }
                    clientServiceImp.create(client);
                }
                case 2 -> {
                    clientView.afficher(clientServiceImp.findAll());
                }
                case 3 -> {
                    List<Client> clts = clientServiceImp.findAll();
                    for (Client clt : clts) {
                        if (clt.getUser()!=null) {
                            System.out.println(clt);
                        }
                    }
                }
                case 4 -> {
                    List<Client> clts = clientServiceImp.findAll();
                    for (Client clt : clts) {
                        if (clt.getUser()==null) {
                            System.out.println(clt);
                        }
                    }
                }
                case 5 ->{
                    scanner.nextLine();
                    System.out.println("Entrer le telephone:");
                    String telephone = scanner.nextLine();
                    Client cli = clientServiceImp.search(telephone);
                    if (cli == null) {
                        System.out.println("Le client n'existe pas");
                    } else {
                        System.out.println(cli);
                    }
                }
            }
        }while(choice!=10);
    }

    public int boutiquierMenu() {
        System.out.println("1- Creer un client");
        System.out.println("2- Lister les clients");
        System.out.println("3- Lister les clients ayant un compte");
        System.out.println("4- Lister les clients n'ayant pas de compte");
        System.out.println("5- Find client by phone ");
        System.out.println("6- Creer une dette ");
        System.out.println("7- Enregistrer un paiement pour une dette ");
        System.out.println("8- Lister les dettes non soldées");
        System.out.println("9- Lister les demandes de dettes en cours");
        System.out.println("9- Lister les demandes de dettes annulées");
        System.out.println("10- Quitter");
        System.out.print("Enter your choice : ");
        return scanner.nextInt();
    }
}
