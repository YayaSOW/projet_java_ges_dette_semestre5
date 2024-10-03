package org.example.services;

import org.example.data.entities.User;
import org.example.data.repositories.list.UserRepositoryList;

import java.util.List;

public class UserServiceImp {
    private UserRepositoryList userRepositoryList = new UserRepositoryList();

    public void create(User user) {
        userRepositoryList.insert(user);
    }

    public List<User> findAll() {
        return userRepositoryList.selectAll();
    }

    public User searchById(int id) {
        return userRepositoryList.selectById(id);
    }
}
