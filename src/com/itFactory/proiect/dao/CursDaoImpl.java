package com.itFactory.proiect.dao;

import com.itFactory.proiect.database.BazaDate;
import com.itFactory.proiect.model.Curs;
import com.itFactory.proiect.model.CursLimbiStraine;
import com.itFactory.proiect.model.CursProgramare;

import java.util.List;

public class CursDaoImpl implements CursDao{

    private final BazaDate bazaDate;

    public CursDaoImpl(BazaDate bazaDate) {
        this.bazaDate = bazaDate;
    }

    @Override
    public void adaugaCurs(Curs curs) {
        List<Curs> listaCursuri = bazaDate.getListaCursuri();

        if(curs instanceof CursProgramare programare){
            System.out.println("am adaugat cursul de: " + programare.getNume() + " cu pret: " + programare.getPret() + " cu data de inceput: " + programare.getDataInceput());
        }

        if(curs instanceof CursLimbiStraine limbiStraine){
            System.out.println("am adaugat cursul de: " + limbiStraine.getNume() + " cu pret: " + limbiStraine.getPret() + " cu profesor: " + limbiStraine.getNumeProfesor());
        }

//        if(curs instanceof CursProgramare){
//            CursProgramare cursProgramare = (CursProgramare) curs;
//            cursProgramare.getDataInceput();
//        }

        listaCursuri.add(curs);


    }

    @Override
    public void cautaCurs(String numeCurs) {
        List<Curs> listaCursuri = bazaDate.getListaCursuri();


    }
}
