package org.example.data.repositories.list;

import org.example.core.repositories.Repository;
import org.example.data.entities.User;

public interface UserRepository extends Repository<User> {
    User selectById(int id);
}
