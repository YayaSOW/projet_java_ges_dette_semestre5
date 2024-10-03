package org.example;

import org.example.core.ClientRepository;
import org.example.core.ClientService;
import org.example.data.entities.Article;
import org.example.data.entities.Client;
import org.example.data.entities.Dette;
import org.example.data.entities.User;
import org.example.data.enums.Etat;
import org.example.data.enums.Statut;
import org.example.data.repositories.bd.ClientRepositoryBD;
import org.example.data.repositories.list.ClientRepositoryList;
import org.example.services.ArticleServiceImp;
import org.example.services.ClientServiceImp;
import org.example.services.DetteServiceImp;
import org.example.services.UserServiceImp;
import org.example.views.ArticleView;
import org.example.views.ClientView;
import org.example.views.DetteView;
import org.example.views.UserView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ClientView clientView = new ClientView();
        UserView userView = new UserView();
        ArticleView articleView = new ArticleView();
        DetteView detteView = new DetteView();
        //
        ClientRepository clientRepository = new ClientRepositoryList();
        ClientService clientServiceImp = new ClientServiceImp(clientRepository);
        //
        UserServiceImp userServiceImp = new UserServiceImp();
        ArticleServiceImp articleServiceImp = new ArticleServiceImp();
        DetteServiceImp detteServiceImp = new DetteServiceImp();
        clientView.setScanner(scanner);
        userView.setScanner(scanner);
        articleView.setScanner(scanner);
        detteView.setScanner(scanner);
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1 -> {
                    scanner.nextLine();
                    clientServiceImp.create(clientView.saisi());
                }
                case 2 -> {
                    clientView.affiche(clientServiceImp.findAll());
                }
                case 3 -> {
                    scanner.nextLine();
                    System.out.println("Enter the Phone :");
                    String phone = scanner.nextLine();
                    Client client = clientServiceImp.search(phone);
                    if (client == null) {
                        System.out.println("Phone " + phone + " not found!!!");
                    } else {
                        System.out.println(client);
                    }
                }
                case 4 -> {
                    List<Client> clients = clientServiceImp.findAll();
                    if (clients.size() == 0) {
                        System.out.println("Vous devez creer au moins un client 🤣🤣🤣");
                    } else {
                        int rule;
                        do {
                            rule = menuRole();
                        } while (rule < 1 || rule > 3);
                        if (rule == 3) {
                            System.out.println("Vous ne pouvez pas creer de compte !!!");
                        } else {
                            scanner.nextLine();
                            clientView.affiche(clients);
                            System.out.println("Enter the client's Phone :");
                            String phone = scanner.nextLine();
                            Client client = clientServiceImp.search(phone);
                            if (client == null) {
                                System.out.println("Phone " + phone + " not found!!!");
                            } else {
                                User user = userView.saisi();
                                user.setClient(client);
                                client.setUser(user);
                                userServiceImp.create(user);
                            }
                        }
                    }
                }
                case 5 -> {
                    List<User> users = new ArrayList<>();
                    for (User user : userServiceImp.findAll()) {
                        if (user.getEtat().compareTo(Etat.valueOf("Activer")) == 0) {
//                            System.out.println(user);
                            users.add(user);
                        }
                    }
                    if (users.size() == 0) {
                        System.out.println("Aucun compte n'est activé");
                    } else {
                        users.forEach(System.out::println);
                        System.out.print("Enter the user's id :");
                        int userId = scanner.nextInt();
                        User us = userServiceImp.searchById(userId);
                        if (us == null) {
                            System.out.println("user not found");
                        } else {
                            us.setEtat(Etat.valueOf("Desactiver"));
                            System.out.println(us);
                            System.out.println("Desactiver avec success ✅");
                        }
                    }
                }
                case 6 -> {
                    List<User> users = new ArrayList<>();
                    for (User user : userServiceImp.findAll()) {
                        if (user.getEtat().compareTo(Etat.valueOf("Desactiver")) == 0) {
//                            System.out.println(user);
                            users.add(user);
                        }
                    }
                    if (users.size() == 0) {
                        System.out.println("Aucun compte n'est desactivé");
                    } else {
                        users.forEach(System.out::println);
                        System.out.print("Enter the user's id :");
                        int userId = scanner.nextInt();
                        User us = userServiceImp.searchById(userId);
                        if (us == null) {
                            System.out.println("user not found");
                        } else {
                            us.setEtat(Etat.valueOf("Activer"));
                            System.out.println(us);
                            System.out.println("Activer avec success ✅");
                        }
                    }
                }
                case 7 -> {
                    for (User user : userServiceImp.findAll()) {
                        if (user.getEtat().compareTo(Etat.valueOf("Activer")) == 0) {
                            System.out.println(user);
                        }
                    }
                }
                case 8 -> {
                    scanner.nextLine();
                    articleServiceImp.create(articleView.saisi());
                }
                case 9 -> {
                    articleView.afficher(articleServiceImp.findAll());
                }
                case 10 -> {
                    articleView.afficheDispo(articleServiceImp.findAll());
                }
                case 11 -> {
                    articleView.afficheDispo(articleServiceImp.findAll());
                    scanner.nextLine();
                    System.out.println("Enter the Libelle :");
                    String libelle = scanner.nextLine();
                    Article article = articleServiceImp.searchByLibelle(libelle);
                    if (article == null) {
                        System.out.println("Phone " + article + " not found!!!");
                    } else {
                        System.out.println(article);
                        System.out.println("Enter the new QteStock");
                        int qte = scanner.nextInt();
                        article.setQteStock(qte);
                    }
                }
                case 12 -> {
                    if (clientServiceImp.findAll().size() == 0 || articleServiceImp.findAll().size() == 0) {
                        System.out.println("Vous devriez creer au moins un client et un article");
                    } else {
                        scanner.nextLine();
                        Dette dette = detteView.saisi();
                        clientView.affiche(clientServiceImp.findAll());
                        scanner.nextLine();
                        System.out.println("Veuillez saisir le telephone du client :");
                        String phone = scanner.nextLine();
                        Client client = clientServiceImp.search(phone);
                        if (client == null) {
                            System.out.println("Phone " + phone + " not found!!!");
                        } else {
                            System.out.println(client);
                            int rep;
                            do {
                                articleView.afficheDispo(articleServiceImp.findAll());
                                System.out.println("Veuillez saisir le libelle de l'article");
                                String libelle = scanner.nextLine();
                                Article article = articleServiceImp.searchByLibelle(libelle);
                                if (article == null) {
                                    System.out.println("Article " + article + " not found!!!");
                                } else {
                                    System.out.println(article);
                                    dette.setClient(client);
                                    client.add(dette);
                                    detteServiceImp.create(dette);
                                }
                                rep = continuer();
                            } while (rep != 2);
                        }
                    }
                }
                case 13 -> {
                    for (Dette dette : detteServiceImp.findAll()) {
                        if (dette.getMontantRestant() == 0) {
                            dette.setStatut(Statut.Archiver);
                            System.out.println(dette);
                        }
                    }
                }
                default -> {
                }
            }
        } while (choice != 14);
        scanner.close();
    }

    public static int menu() {
        System.out.println("1- Creer un client");
        System.out.println("2- Lister les client");
        System.out.println("3- Find client by phone ");
        System.out.println("4- Créer un compte utilisateur pour un client ");
        System.out.println("5- Désactiver un compte utilisateur ");
        System.out.println("6- Activer un compte utilisateur ");
        System.out.println("7- Afficher les comptes utilisateurs  actifs ");
        System.out.println("8- Créer un article ");
        System.out.println("9- lister les articles ");
        System.out.println("10- lister les articles disponible ");
        System.out.println("11- Mettre à jour la Qte en Stock d’un article ");
        System.out.println("12- Creer une dette ");
        System.out.println("13- Archiver les dettes soldées ");
        System.out.println("14- Quitter");
        System.out.print("Enter your choice : ");
        return scanner.nextInt();
    }

    public static int menuRole() {
        System.out.println("1- Boutiquier");
        System.out.println("2- Admin");
        System.out.println("3- Client ");
        System.out.print("Enter your rule : ");
        return scanner.nextInt();
    }

    public static int continuer() {
        int rep;
        do {
            System.out.println("Voulez-vous ajouter un autre article ?");
            System.out.println("1- Oui");
            System.out.println("2- Non");
            rep = scanner.nextInt();
        } while (rep != 1 && rep != 2);
        scanner.nextLine();
        return rep;
        //AOP
    }
}