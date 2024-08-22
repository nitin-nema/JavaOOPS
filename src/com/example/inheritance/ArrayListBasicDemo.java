package com.example.inheritance;

import java.util.ArrayList;

public class ArrayListBasicDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Removing elements
        list.remove("Banana");
        System.out.println("List after removal: " + list);

        // Iterating over elements
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
