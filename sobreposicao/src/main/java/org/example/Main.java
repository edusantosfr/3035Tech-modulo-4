package org.example;

import org.example.entity.Aluno;
import org.example.entity.Professor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Cleomar", LocalDate.of(1991, 2, 10), 12);

        System.out.printf(aluno.getNome());
        System.out.println(aluno.verificarCpf());

        Professor professor = new Professor("Cleomar Teach",LocalDate.of(2001, 10, 2), "Programação");

        System.out.println(professor.getDisciplina());
        System.out.println(professor.getDataNascimento());

        System.out.println("Aluno: " + aluno.verificarCpf());
        System.out.println("Professor: " + professor.verificarCpf());
    }
}