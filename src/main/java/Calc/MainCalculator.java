package Calc;

import static Calc.Calculator.menu;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator program!");
        System.out.println("That program can : \n" +
                "1. Add two numbers \n" +
                "2. Subtract two numbers \n" +
                "3. Divide two numbers \n" +
                "4. Multiply two numbers \n");
        menu();
    }
}
