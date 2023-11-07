package com.itFactory.liste;

import java.util.ArrayList;
import java.util.List;

public class Exemplu3 {

    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();

        lista1.add(1); //index 0
        lista1.add(2); //index 1
        lista1.add(8); //index 2

        if(!lista1.isEmpty()){
            for(Integer element: lista1){
                System.out.println(element);
            }
        }

       // lista1.forEach(elelement -> System.out.println(elelement));

        lista1.add(2, 253); //index 2
                                            // elementul 3 o sa treaca pe indexul 3

        System.out.println("----------------");
        System.out.println("Elementul de pe indexul 2 este: " + lista1.get(2)); // luam elementul de pe indexul 2

        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
// ////////////////////////////////////////////////////

        List<Integer> lista2 = new ArrayList<>();

        lista2.add(300);
        lista2.add(300);
        lista2.add(300);
        lista2.add(300);

        lista1.addAll(lista2);

        System.out.println("************************");

        for(Integer x: lista1){
            System.out.println(x);
        }

        System.out.println("////////////////////////////");

        if(lista1.size() > 0){
            System.out.println(lista1.get(lista1.size() - 1));
        }





    }


}
