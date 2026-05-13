package com.joseph;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(2, 3));
        System.out.println("Subtraction: " + calc.subtract(3, 2));
        System.out.println("Multiplication: " + calc.multiply(2, 3));
        System.out.println("Division: " + calc.divide(6, 3));
    }
}