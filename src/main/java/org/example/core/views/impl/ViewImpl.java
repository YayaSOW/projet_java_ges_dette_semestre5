package org.example.core.views.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.example.core.views.View;

public abstract class ViewImpl<T> implements View<T> {
    protected Scanner scanner;

    @Override
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public LocalDate formatDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }

    @Override
    public void afficher(List<T> data) {
        data.forEach(System.out::println);
    }

    // public void afficher(List <Article> articles){
    // articles.forEach(System.out::println);
    // }
}
