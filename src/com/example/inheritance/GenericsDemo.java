package com.example.inheritance;

import java.util.ArrayList;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Using Box with Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Integer Box contains: " + integerBox.getItem());

        // Using Box with String
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getItem());
    }
}
