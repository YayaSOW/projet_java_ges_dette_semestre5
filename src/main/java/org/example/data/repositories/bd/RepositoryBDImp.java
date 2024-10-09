package org.example.data.repositories.bd;

import java.util.List;

import org.example.core.repositories.Repository;

public class RepositoryBDImp<T> implements Repository<T> {
    @Override
    public void insert(T data) {
        System.out.println("Base de donne");
    }

    @Override
    public List<T> selectAll() {
        return null;
    }
}
