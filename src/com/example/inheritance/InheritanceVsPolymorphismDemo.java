package com.example.inheritance;

class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display from Child");
    }
}

public class InheritanceVsPolymorphismDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();

        p.display(); // Calls Parent's display
        c.display(); // Calls Child's display (Polymorphism)
    }
}
