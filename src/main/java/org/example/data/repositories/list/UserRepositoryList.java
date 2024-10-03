package org.example.data.repositories.list;

import org.example.data.entities.User;

public class UserRepositoryList extends RepositoryListImp<User> {

    public User selectById(int id) {
        return list.stream().
                filter(user -> user.getId() == id).
                findFirst().orElse(null);
    }
}
