package com.itFactory.proiect.main;

import com.itFactory.proiect.dao.CursDao;
import com.itFactory.proiect.dao.CursDaoImpl;
import com.itFactory.proiect.database.BazaDate;
import com.itFactory.proiect.model.CursLimbiStraine;
import com.itFactory.proiect.model.CursProgramare;

import java.util.Scanner;


/**
 *
 * Sa se salveze in baza de date un curs de programare cu numele -> java
 * si mai apoi sa se caute in baza de date cursul de programare cu numele java si sa se afiseze: nume curs, pret curs, dataInceput
 *
 * */

public class Start {
    public static void main(String[] args) {

        BazaDate bazaDate = new BazaDate();
        CursDao cursDao = new CursDaoImpl(bazaDate);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Alege ce vrei sa faci in continuare:");
        System.out.println("adauga curs programare: -> programare");
        System.out.println("adauga curs limbi straine: - > limbiStraine");
        System.out.println("******************************");


        while (true) {
            System.out.println("Astept comanda: ");
            String comanda = scanner.nextLine();

            switch (comanda.toLowerCase().trim()) {

                case "programare":
                    System.out.println("introdu pe rand: -> nume curs.....pret curs:.....dataInceput:.....");
                    String str1[] = scanner.nextLine().split(" ");

                    CursProgramare cursProgramare = new CursProgramare();
                    cursProgramare.setNume(str1[0]);
                    cursProgramare.setPret(Integer.parseInt(str1[1]));
                    cursProgramare.setDataInceput(str1[2]);

                    cursDao.adaugaCurs(cursProgramare);
                    break;

                case "limbistraine":
                    System.out.println("introdu pe rand: -> nume curs.....pret curs:.....profesor:.....");
                    String str2[] = scanner.nextLine().split(",");

                    CursLimbiStraine limbiStraine = new CursLimbiStraine(str2[0], Integer.parseInt(str2[1]), str2[2]);

//                    CursLimbiStraine limbiStraine = new CursLimbiStraine();
//                    limbiStraine.setNume(str2[0]);
//                    limbiStraine.setPret(Integer.parseInt(str2[1]));
//                    limbiStraine.setNumeProfesor(str2[2]);

                    cursDao.adaugaCurs(limbiStraine);
                    break;

                case "exit":
                    System.exit(0);
                    break;

                case "info":
                    System.out.println("introdu nume curs: ");
                    String str3 = scanner.nextLine();
                    cursDao.cautaCurs(str3);

                default:
                    System.out.println("comadna gresita");
            }

        }


    }


}
