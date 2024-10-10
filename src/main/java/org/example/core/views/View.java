package org.example.core.views;

import java.util.List;
import java.util.Scanner;

public interface View<T> {
    T saisi();
    void afficher(List<T> data);
    void setScanner(Scanner scanner);
}
