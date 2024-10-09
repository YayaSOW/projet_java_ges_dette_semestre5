package org.example.services;

import java.util.List;

import org.example.data.entities.User;

public interface UserService {
    void create(User user);
    List<User> findAll();
    User searchById(int id);
}
