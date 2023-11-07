package com.itFactory.array;

import java.util.Arrays;

public class Exemplu2 {

    public static void main(String[] args) {

        String x[] = {"gigel","ionel", "vasile"};

        for(String s: x){
            if(!s.equals("gigel")){
                System.out.println(s);
            }
        }

        System.out.println("---------------");

        Arrays.stream(x)
               // .filter(e -> e.equals("gigel"))
                .forEach(s -> System.out.println(s));



    }

}
