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
    public char zleSpakowany(){
        for (int i = 0; i < zawartoscKomoryJeden().length(); i++) {
            char znak = zawartoscKomoryJeden().charAt(i);
            if (zawartoscKomoryDwa().contains(String.valueOf(znak))){
                return znak;
            }
        }
        return 'x';
    }
    public int pryjorytet(){
        String znaki = "abcdefghijklmnoprstuwxyzABCDEFGHIJKLMNOPRSTUWXYZ";
        char a = zleSpakowany();
        for (int i = 0; i < znaki.length(); i++) {
            if (znaki.charAt(i) == a){
                return i+1;
            }
        }
        return 0;
    }
}
