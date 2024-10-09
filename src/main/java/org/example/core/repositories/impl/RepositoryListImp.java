package org.example.core.repositories.impl;

import java.util.ArrayList;
import java.util.List;

import org.example.core.repositories.Repository;

public class RepositoryListImp <T> implements Repository<T> {
    protected List<T> list = new ArrayList<>();

    @Override
    public void insert(T data) {
        list.add(data);
    }
    @Override
    public List<T> selectAll() {
        return list;
    }
}
