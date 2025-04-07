package org.example;

public class Jogador {
     String posicao;
     String nome;
     int idade;
     String corDeCabelo;
     double altura;

    public Jogador(String posicao, String nome, int idade, String corDeCabelo, double altura) {
        this.posicao = posicao;
        this.nome = nome;
        this.idade = idade;
        this.corDeCabelo = corDeCabelo;
        this.altura = altura;
    }

    public Jogador(String nome, int idade, String corDeCabelo, double altura) {
        this.posicao = "Atacante";
        this.nome = nome;
        this.idade = idade;
        this.corDeCabelo = corDeCabelo;
        this.altura = altura;
    }

    public Jogador() {

    }
}
