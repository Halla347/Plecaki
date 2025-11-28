package org.example;

public class Plecak {
    private String zawartosc;

    public Plecak(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public String zawartoscKomoryJeden() {
        return zawartosc.substring(0, zawartosc.length() / 2);
    }

    public String zawartoscKomoryDwa() {
        return zawartosc.substring(zawartosc.length() / 2);
    }

    public char zleSpakowany() {
        String k1 = zawartoscKomoryJeden();
        String k2 = zawartoscKomoryDwa();

        for (int i = 0; i < k1.length(); i++) {
            char znak = k1.charAt(i);
            if (k2.indexOf(znak) != -1) {
                return znak;
            }
        }
        return 'x'; // w treści zadania nie występuje taki przypadek
    }

    public int priorytet() {
        char c = zleSpakowany();
        if (c >= 'a' && c <= 'z') return c - 'a' + 1;     // 1–26
        if (c >= 'A' && c <= 'Z') return c - 'A' + 27;    // 27–52
        return 0;
    }
}
