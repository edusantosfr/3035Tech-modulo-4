package org.example.entity;

import java.time.LocalDate;

public class Pessoa {
    protected String nome;
    private LocalDate dataNascimento;

    protected String cpf;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String verificarCpf() {
        String retorno = "";

        if (cpf != null) {
            retorno = "CPF Existente";
        } else {
            retorno = "CPF Inexistente";
        }

        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
