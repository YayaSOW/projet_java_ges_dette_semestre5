package org.example.services.impl;

import org.example.data.entities.User;
import org.example.data.repositories.list.impl.UserRepositoryList;
import org.example.services.UserService;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserRepositoryList userRepositoryList = new UserRepositoryList();

    @Override
    public void create(User user) {
        userRepositoryList.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userRepositoryList.selectAll();
    }

    @Override
    public User searchById(int id) {
        return userRepositoryList.selectById(id);
    }
}
