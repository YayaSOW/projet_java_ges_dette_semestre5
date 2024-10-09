package org.example.core.views;

import java.util.List;

public interface View<T> {
    T saisi();
    void afficher(List<T> data);
}
