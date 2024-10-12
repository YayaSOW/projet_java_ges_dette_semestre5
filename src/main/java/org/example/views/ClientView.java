package org.example.views;

import org.example.core.views.View;
import org.example.core.views.impl.ViewImpl;
import org.example.data.entities.Client;


public class ClientView extends ViewImpl<Client> implements View<Client>{

    @Override
    public Client saisi(){
        Client client = new Client();
        System.out.println("Enter the surname:");
        client.setSurname(scanner.nextLine());
        System.out.println("Enter the telephone:");
        client.setTelephone(scanner.nextLine());
        System.out.println("Enter the Client's address:");
        client.setAddress(scanner.nextLine());
        return client;
    }
}
