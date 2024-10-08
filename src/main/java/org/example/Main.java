package org.example;

import org.example.core.ClientRepository;
import org.example.core.ClientService;
import org.example.data.repositories.list.ClientRepositoryList;
import org.example.services.ArticleServiceImp;
import org.example.services.ClientServiceImp;
import org.example.services.DetteServiceImp;
import org.example.services.UserServiceImp;
import org.example.views.ArticleView;
import org.example.views.ClientView;
import org.example.views.DetteView;
import org.example.views.UserView;
import org.example.views.admin.AdminView;

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
        // Création des vues
        AdminView adminView = new AdminView(clientServiceImp, clientView, userView, articleView, detteView,
                userServiceImp, articleServiceImp, detteServiceImp, scanner);
        int rule;
        do {
            rule = menuRole();
            switch (rule) {
                case 1 -> {
                    System.out.println("Boutiquier");
                }
                case 2 -> {
                    adminView.adminRole();
                }
                case 3 -> {
                    System.out.println("Client");
                }
                default -> {
                }
            }
        } while (rule != 4);
        scanner.close();
    }

    public static int menuRole() {
        System.out.println("1- Boutiquier");
        System.out.println("2- Admin");
        System.out.println("3- Client ");
        System.out.println("4- Quitter");
        System.out.print("Enter your rule : ");
        return scanner.nextInt();
    }
}