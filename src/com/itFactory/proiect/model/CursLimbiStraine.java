package com.itFactory.proiect.model;

public class CursLimbiStraine extends Curs{

    private String numeProfesor;

    public CursLimbiStraine(String nume, int pret, String numeProfesor) {
        super(nume, pret);
        this.numeProfesor = numeProfesor;
    }

    public CursLimbiStraine() {
    }

    public String getNumeProfesor() {
        return numeProfesor;
    }

    public void setNumeProfesor(String numeProfesor) {
        this.numeProfesor = numeProfesor;
    }
}
