package org.example.views;

import org.example.core.views.impl.ViewImpl;
import org.example.data.entities.User;
import org.example.data.enums.Etat;

public class UserView extends ViewImpl<User>{

    @Override
    public User saisi(){
        User user = new User();
        System.out.println("Enter the user's mail: ");
        user.setEmail(scanner.nextLine());
        System.out.println("Enter the user's login: ");
        user.setLogin(scanner.nextLine());
        System.out.println("Enter the user's password: ");
        user.setPassword(scanner.nextLine());
        user.setEtat(Etat.Activer);
        return  user;
    }
}
