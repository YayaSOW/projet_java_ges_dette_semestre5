package org.example;

import org.example.core.factory.impl.ServiceFactoryImpl;
import org.example.core.factory.impl.ViewFactoryImpl;
import org.example.core.views.View;
import org.example.core.views.impl.ArticleViewImpl;
import org.example.core.factory.ServiceFactory;
import org.example.core.factory.ViewFactory;
import org.example.data.entities.Client;
import org.example.data.entities.Dette;
import org.example.data.entities.User;
import org.example.services.ClientService;
import org.example.services.UserService;
import org.example.services.ArticleService;
import org.example.services.DetteService;
import org.example.views.admin.AdminView;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Factory
        ViewFactory viewFactory = new ViewFactoryImpl();
        ServiceFactory serviceFactoryImpl = new ServiceFactoryImpl();
            //View
        View<Client> clientView = viewFactory.getInstanceClientView();
        View<User> userView = viewFactory.getInstanceUserView();
        ArticleViewImpl articleView = viewFactory.getInstanceArticleView();
        View<Dette> detteView = viewFactory.getInstanceDetteView();
            //Service && Repository
        ClientService clientServiceImp = serviceFactoryImpl.getInstanceClientService();
        UserService userServiceImp = serviceFactoryImpl.getInstanceUserService();
        ArticleService articleServiceImp = serviceFactoryImpl.getInstanceArticleService();
        DetteService detteServiceImp = serviceFactoryImpl.getInstanceDetteService();
        //
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