package com.example.inheritance;

// Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Multiple Inheritance (using Interfaces)
interface Flyer {
    void fly();
}

class Bird extends Animal implements Flyer {
    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}

public class InheritanceTypesDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}
