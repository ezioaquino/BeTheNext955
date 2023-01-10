package org.example;

import aluno.Aluno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(
                new Aluno(1, "Cícero", LocalDate.of(1990, 01, 01))
        );//1
        alunos.add(
                new Aluno(2, "Wallys", LocalDate.of(1991, 12, 31))
        );//2
        alunos.add(
                new Aluno(4, "Ariane", LocalDate.of(1992, 04, 25))
        );//3

        System.out.println("Lista desordenada");
        System.out.println(alunos);

        //Collections.sort(alunos, Comparable<alunos>);
        Collections.sort(alunos);

        System.out.println("Lista ordenada");
        System.out.println(alunos);
    }

}