package com.itFactory.liste;

import java.util.ArrayList;
import java.util.List;

public class Exemplu4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        list1.add(5); //index 0
        list1.add(8); //index 1

        list2.add(5);
        list2.add(8);

        boolean x = list1.equals(list2);
        System.out.println(x);

        list2.contains(8); //returneaza true daca lista contine pe 8
        list2.contains(1); //returneaza false daca lista nu contine pe 1;

        System.out.println(list2.contains(1));

        list1.remove(0);
        list1.remove(0);

        System.out.println("Este lista goala? : " + list1.isEmpty());

        if(list1.size() > list2.size()){
            System.out.println("zzzzzzzzz");
        } else {
            System.out.println("aaaaaaaaa");
        }

        boolean o = list1.size() == list2.size();

    }
}
