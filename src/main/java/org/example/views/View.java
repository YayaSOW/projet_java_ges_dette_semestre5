package org.example.views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class View {
    protected Scanner scanner;

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public LocalDate formatDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,formatter);
    }
}
