package org.example.data.repositories.bd;

import org.example.core.Repository;

import java.util.List;

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
