package com.example.inheritance;

import java.util.Arrays;

class MyArrayList<T> {
    private Object[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        array = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
        array[size++] = element;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
}

public class CustomArrayListDemo {
    public static void main(String[] args) {
        MyArrayList<String> customList = new MyArrayList<>();
        customList.add("Apple");
        customList.add("Banana");
        customList.add("Cherry");

        System.out.println("Element at index 1: " + customList.get(1));
        System.out.println("Custom ArrayList: " + customList);
        System.out.println("Size of Custom ArrayList: " + customList.size());
    }
}
