package org.example;

public class Jogador {
    private String posicao;
    private String nome;
    private int idade;
    private String corDeCabelo;
    private double altura;

    public Jogador(String posicao, String nome, int idade, String corDeCabelo, double altura) {
        this.posicao = posicao;
        this.nome = nome;
        this.idade = idade;
        this.corDeCabelo = corDeCabelo;
        this.altura = altura;
    }

    public void chutar() {
        String distancia = this.verificarDistanciaBola();
        System.out.println("Chutando bola ........." + distancia);
    }

    private String verificarDistanciaBola(){
        return "perto";
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDeCabelo() {
        return this.corDeCabelo;
    }

    public void setCorDeCabelo(String corDeCabelo) {
        this.corDeCabelo = corDeCabelo;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
