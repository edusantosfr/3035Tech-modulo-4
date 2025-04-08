package org.example;

public class Main {
    public static void main(String[] args) {

        int numeroInt = 0;
        try {
            numeroInt = Integer.parseInt("1");
            int numeroDivisivel = 10 / 0;
        } catch (NumberFormatException exception) {
            System.out.println("\nErro ao tentar fazer o parse de uma String para um Int" + exception.getMessage());
        } catch (ArithmeticException exception) {
            System.out.println("\nErro ao tentar fazer a divisão por 0: " + exception.getMessage());
        } finally {
            System.out.println("Finalizando Sistema!!" + numeroInt);
        }
//        System.out.println("Finalizando Sistema!!" + numeroInt);
    }
}