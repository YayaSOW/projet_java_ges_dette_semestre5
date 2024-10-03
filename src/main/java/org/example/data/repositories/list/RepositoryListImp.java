package org.example.data.repositories.list;

import org.example.core.Repository;

import java.util.ArrayList;
import java.util.List;

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
