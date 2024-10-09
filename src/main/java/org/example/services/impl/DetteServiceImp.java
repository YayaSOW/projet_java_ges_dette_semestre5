package org.example.services.impl;

import org.example.data.entities.Dette;
import org.example.data.repositories.list.impl.DetteRepositoryList;
import org.example.services.DetteService;

import java.util.List;

public class DetteServiceImp implements DetteService {
    private DetteRepositoryList detteRepositoryList = new DetteRepositoryList();

    @Override
    public void create(Dette dette) {
        detteRepositoryList.insert(dette);
    }

    @Override
    public List<Dette> findAll() {
        return detteRepositoryList.selectAll();
    }
}
