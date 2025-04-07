package org.example.entity;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private int numeroMatricula;

    public Aluno(String nome, LocalDate dataNascimento, int numeroMatricula) {
        super(nome, dataNascimento);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String verificarCpf() {
        String retorno = "";

        if (cpf == null) {
            retorno = "Você ainda não cadastrou seu cpf";
        } else {
            retorno = cpf;
        }

        return retorno;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
