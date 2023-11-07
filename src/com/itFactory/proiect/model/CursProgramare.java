package com.itFactory.proiect.model;

public class CursProgramare extends Curs {

    private String dataInceput;

    public CursProgramare(String nume, int pret, String dataInceput) {
        super(nume, pret);
        this.dataInceput = dataInceput;
    }

    public CursProgramare() {
    }

    public String getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(String dataInceput) {
        this.dataInceput = dataInceput;
    }
}
