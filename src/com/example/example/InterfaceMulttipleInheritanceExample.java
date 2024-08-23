package com.example.example;
interface EveryAnimal{
    void eat();
}

interface DomesticAnimal{
    void play();
}

class Dog implements EveryAnimal, DomesticAnimal{
    @Override
    public void eat(){
        /* implemention */
    }

    @Override
    public void play(){
        /* implemention */
    }
}

public class InterfaceMulttipleInheritanceExample {
}
