package org.example;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar", 31, "Preto", 1.75);

        System.out.println(jogador1.getPosicao());
        System.out.println(jogador1.getAltura());
        System.out.println(jogador1.getCorDeCabelo());
        System.out.println(jogador1.getNome());
        System.out.println(jogador1.getIdade());

        jogador1.setPosicao("Jagueiro");
        jogador1.setIdade(31);

        System.out.println(jogador1.getPosicao());
        System.out.println(jogador1.getIdade());
    }
}