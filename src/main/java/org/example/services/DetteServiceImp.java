package org.example.services;

import org.example.data.entities.Dette;
import org.example.data.repositories.list.DetteRepositoryList;

import java.util.List;

public class DetteServiceImp {
    private DetteRepositoryList detteRepositoryList = new DetteRepositoryList();

    public void create(Dette dette) {
        detteRepositoryList.insert(dette);
    }

    public List<Dette> findAll() {
        return detteRepositoryList.selectAll();
    }
}
