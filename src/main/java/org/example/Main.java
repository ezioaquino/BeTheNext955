package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);//1
        numeros.add(80);//2
        numeros.add(41);//3
        numeros.add(86);//4
        numeros.add(31);//5
        numeros.add(52);//6
        numeros.add(19);//7
        numeros.add(80);//8

        System.out.println("Lista desordenada");
        System.out.println(numeros);

        Collections.sort(numeros, new Comparator<Integer>() {
            @Override
            public int compare(Integer esquerda, Integer direita) {
                if (esquerda > direita) {
                    return -1;
                } else if (esquerda < direita) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Lista ordenada");
        System.out.println(numeros);
    }

}