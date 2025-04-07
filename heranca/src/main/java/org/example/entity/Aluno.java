package org.example.entity;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private int numeroMatricula;

    public Aluno(String nome, LocalDate dataNascimento, int numeroMatricula) {
        super(nome, dataNascimento);
        this.numeroMatricula = numeroMatricula;
    }

    public String verificarNome() {
        String test = nome;

        return test;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
