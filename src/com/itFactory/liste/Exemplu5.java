package com.itFactory.liste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplu5 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("gigel");
        lista.add("ionel");

        for(String x : lista) {
            System.out.println(x);
        }
        System.out.println("--------------------------");

        String x [] = new String[lista.size()]; //initializam arrray-ul

        x = lista.toArray(x);

        for(String y: x){
            System.out.println(y);
        }

        List<String> lista1 = Arrays.asList(x); //mai des folosita in practica

        lista1.forEach(element -> System.out.println(element + " *"));


    }

}
