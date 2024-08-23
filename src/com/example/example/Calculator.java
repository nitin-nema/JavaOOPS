package com.example.example;

public class Calculator {

    //
    public int add(int a, int b){
        return  a +b;
    }

    // 3 arguments
    //Method overloading
    public int add(int a, int b, int c){
        return  a +b +c;
    }

    // Method overriding
//    @Override
//    public int add(int a, int b, int c){
//        /* different imp */
//        return  a +b +c;
//    }


    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2,3,7));
        System.out.println(calc.add(2.5,3.8));


    }
}

