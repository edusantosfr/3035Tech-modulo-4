package org.example;

public class Main {
    public static void main(String[] args) {

        Brinquedo aviao = new Aviao();
        Brinquedo barco = new Barco();

        barco.mover();
        aviao.mover();
    }
}