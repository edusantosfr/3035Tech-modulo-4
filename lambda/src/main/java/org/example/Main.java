package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("12");
        list.add("62");
        list.add("25");
        list.add("22");
        list.add("02");
        list.add("22");

        String test = "22";

        Comparator<String> comparator = (p1, p2) -> p1.compareTo(p2);
        Predicate<String> predicate = p1 -> p1.equalsIgnoreCase(test);
        Consumer<String> consumer = item -> System.out.println(item);

        System.out.println("=========================================================");
        System.out.println("Ordenada pelo comparator e usando o consumer para printar");
        list.stream()
                .sorted(comparator)
                .forEach(consumer);

        System.out.println();
        System.out.println("=========================================================");
        System.out.println("Filtrando pelo predicate e usando o consumer para printar");
        list.stream()
                .filter(predicate) //item -> item.equalsIgnoreCase(test)
                .distinct()
                .forEach(consumer);

        System.out.println();
        System.out.println("=========================================================");
        System.out.println("Usando o consumer para printar e sem ordenar");
        list.stream()
                .forEach(consumer);

    }
}