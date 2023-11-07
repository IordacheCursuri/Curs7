package com.itFactory.proiect.model;

public abstract class Curs {

    private String nume;
    private int pret;

    public Curs(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public Curs() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
