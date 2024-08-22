package com.example.LamdaEtc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionsDemo {
    public static void main(String[] args) {
        // Functional Interface: Consumer
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

        // Using lambda with Consumer
        printUpperCase.accept("hello");

        // Sorting a list using lambda
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + list);
    }
}
