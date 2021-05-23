package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        int factorial = 1;

        while (number <= 10 && number >= 0) {
            factorial = factorial * number;
            System.out.println("Факториал числа " + number + " = " + factorial);
            number++;
        }
    }
}
