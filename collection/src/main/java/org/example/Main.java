package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] arrayNumeros = new String[3];

        arrayNumeros[0] = "1";
        arrayNumeros[1] = "2";
        arrayNumeros[2] = "3";

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Indice: " + arrayNumeros[i]);
        }

        System.out.println("============================================================");

        ArrayList<String> arrayList = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("num1");
        list.add("num1");
        list.add("num2");
        list.add("num3");

        list.forEach(item -> System.out.println("Indice da Lista: " + item));

        System.out.println("Indice usando o Get: " + list.get(2));

        System.out.println("Método contains: " + list.contains("num1"));

        System.out.println("============================================================");

        HashSet<String> hashSet = new HashSet<>();
        Set<String> set = new HashSet<>();

        set.add("num1");
        set.add("num1");
        set.add("num2");
        set.add("num3");

        set.forEach(item -> System.out.println("Indice da Lista: " + item));
        System.out.println("Método contains: " + set.contains("num1"));
    }
}