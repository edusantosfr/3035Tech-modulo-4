package org.example;

public class Main {
    public static void main(String[] args) {
        Jogador jogadorFilled = new Jogador("Atacante","Neymar", 31, "Preto", 1.75);
        System.out.println(jogadorFilled.nome);

        Jogador jogadorEmpty = new Jogador();
        System.out.println(jogadorEmpty.nome);
    }
}