package org.example.services;

import org.example.data.entities.Dette;

import java.util.List;

public interface DetteService {
    void create(Dette dette);
    List<Dette> findAll();
}
