package org.example.services.impl;

import org.example.data.entities.User;
import org.example.data.repositories.list.UserRepository;
import org.example.services.UserService;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(User user) {
        userRepository.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.selectAll();
    }

    @Override
    public User searchById(int id) {
        return userRepository.selectById(id);
    }
}
