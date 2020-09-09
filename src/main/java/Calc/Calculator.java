package Calc;

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
                "2. If you wont subtract two numbers. \n" +
                "3. If you wont divide two numbers. \n" +
                "4. If you wont multiply two numbers. \n" +
                "5 If you wont exit.");
        System.out.print("Enter your number :");
        double choiceDouble = Scanner();
        int choice = (int) Math.round(choiceDouble);
        switch (choice) {
            case 1:
                Addition(x, y);
                menu();
                break;
            case 2:
                Subtract(x, y);
                menu();
                break;
            case 3:
                Divide(x, y);
                menu();
                break;
            case 4:
                Multiply(x, y);
                menu();
                break;
            case 5:
                System.out.print("Good by!");
                break;
            default:
                System.out.println("You enter un correct data! Try again");
                menu();
        }
        while (choice != 5) ;

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

    public static double Addition(double x, double y) {
        double result = x + y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

    public static double Subtract(double x, double y) {
        double result = x - y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

    public static double Divide(double x, double y) {
        if (y != 0 & x != 0) {
            double result = x / y;
            System.out.println("The result of the operation is a number: " + result);
            return result;
        } else {
            System.out.println("Operation with number 0 is pointless.");
        } return 0;
    }

    public static double Multiply(double x, double y) {
        double result = x * y;
        System.out.println("The result of the operation is a number: " + result);
        return result;
    }

}
