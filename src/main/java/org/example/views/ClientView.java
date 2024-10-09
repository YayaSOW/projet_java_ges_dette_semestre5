package org.example.views;

import org.example.core.views.impl.ViewImpl;
import org.example.data.entities.Client;

import java.util.List;

public class ClientView extends ViewImpl<Client>{

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

//    public void afficher(List<Client> clients){
//        clients.stream().forEach(client ->System.out.println(client));
//    }
    // public void afficher(List<Client> clients){
    //     clients.forEach(System.out::println);
    // }

}
