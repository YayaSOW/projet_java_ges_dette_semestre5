package org.example.data.repositories.list.impl;

import org.example.core.repositories.impl.RepositoryListImp;
import org.example.data.entities.User;
import org.example.data.repositories.list.UserRepository;

public class UserRepositoryList extends RepositoryListImp<User> implements UserRepository {

    @Override
    public User selectById(int id) {
        return list.stream().
                filter(user -> user.getId() == id).
                findFirst().orElse(null);
    }
}
