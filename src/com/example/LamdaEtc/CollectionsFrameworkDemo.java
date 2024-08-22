package com.example.LamdaEtc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class CollectionsFrameworkDemo {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Dog"); // Duplicate, will not be added
        System.out.println("HashSet: " + hashSet);

        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        System.out.println("HashMap: " + hashMap);

        // Iterating over HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
