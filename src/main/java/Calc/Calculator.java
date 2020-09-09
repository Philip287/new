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
                "3. If you wont divide two numbers \n" +
                "4. If you wont multiply two numbers \n" +
                "5 If you wont exit.");
        System.out.print("Enter your number :");
        double choiceDouble = Scanner();
        int choice = (int) Math.round(choiceDouble);
        switch (choice) {
            case 1:
                addition(x, y);
                menu();
                break;
            case 2:
                subtract (x, y);
                menu();
                break;
            case 3:
                divide (x , y);
                menu();
                break;
            case 4:
                multiply(x , y);
                menu();
                break;
            case 5:
                System.out.print("Good by!");
                break;
            default:
                System.out.println("You enter un correct data! Try again");
                menu();
        }while (choice != 5);

    }


    public static Double Scanner() {
        Scanner in = new Scanner(System.in);
        try {
            String str1 = in.nextLine();
            double a = Double.parseDouble(str1);
            return a;
        } catch (Exception e) {
            System.out.print("Try again! Enter number :");
        }
        return Scanner();
    }

    public static double addition(double x, double y) {
        double result = x + y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

    public static double subtract(double x, double y) {
        double result = x - y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

    public static double divide(double x, double y){
        double result = x / y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

    public static double multiply (double x, double y) {
        double result = x * y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

}
