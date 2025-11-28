package org.example;

import java.util.List;

public class Plecaki {

    private List<Plecak> plecaki;

    public Plecaki(List<String> zawartosci) {
        this.plecaki = zawartosci.stream()
                .map(Plecak::new)
                .toList();
    }

    public int sumaPriorytetow() {
        return plecaki.stream()
                .mapToInt(Plecak::priorytet)
                .sum();
    }
}
