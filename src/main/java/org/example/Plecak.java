package org.example;

public class Plecak {
    private String zawartosc;

    public Plecak(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public String getZawartosc() {
        return zawartosc;
    }

    public void setZawartosc(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public String zawartoscKomoryJeden() {

        return zawartosc.substring(0,zawartosc.length()/2);
    }

    public String zawartoscKomoryDwa() {
        return zawartosc.substring(zawartosc.length()/2);
    }
}
