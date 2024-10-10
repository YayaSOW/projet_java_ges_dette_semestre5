package org.example.services.impl;

import org.example.data.entities.Dette;
import org.example.data.repositories.list.DetteRepository;
import org.example.services.DetteService;

import java.util.List;

public class DetteServiceImp implements DetteService {
    private DetteRepository detteRepositoryList;

    public DetteServiceImp(DetteRepository detteRepositoryList) {
        this.detteRepositoryList = detteRepositoryList;
    }

    @Override
    public void create(Dette dette) {
        detteRepositoryList.insert(dette);
    }

    @Override
    public List<Dette> findAll() {
        return detteRepositoryList.selectAll();
    }
}
