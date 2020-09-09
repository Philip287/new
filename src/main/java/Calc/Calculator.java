package Calc;

import java.awt.*;
import java.util.Scanner;

public class Calculator {

    public static void menu() {
        System.out.print("Enter the first number :");
        double x = Scanner();
        System.out.print("Enter the second number :");
        double y = Scanner();
        System.out.println("Enter what do you want do with this numbers?");
        System.out.println("Enter number : \n" +
                "1. If you wont add two numbers. \n" +
                "2. If you wont subtract two numbers \n" +
                "3. If you wont divide two numbers \n " +
                "4. If you wont multiply two numbers \n" +
                "5 If you wont exit.");
        System.out.print("Enter your number :");
        double choiceDouble = Scanner();
        int choice = (int) Math.round(choiceDouble);
        switch (choice) {
            case 1:
                System.out.print("The result of the operation is a number: ");
                break;
            case 2:
                System.out.print("The result of the operation is a number: ");
                System.out.println(addition(x, y));
                break;
            case 3:
                System.out.print("The result of the operation is a number: ");
                break;
            case 4:
                System.out.print("The result of the operation is a number: ");
                break;
            case 5:
                System.out.print("Good by!");
                break;
            default:
                System.out.println("You enter un correct data! Try again");
        }

    }

    public static Double Scanner() {
        Scanner in = new Scanner(System.in);
        try {
            String str1 = in.nextLine();
            double a = Double.parseDouble(str1);
            return a;
        } catch (Exception e) {
            System.out.println("Try again! ");
        }
        return Scanner();
    }

    public static double addition(double x, double y) {
        double result = x + y;
        return result;
    }

    public double difference(double x, double y) {
        double result = x - y;
        return result;
    }
}
