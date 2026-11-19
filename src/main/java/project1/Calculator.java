package project1;

import java.util.Scanner;

public class Calculator {
    public static void showMenu() {
        System.out.println("Select operation:");
        System.out.println("1- Multiplication");
        System.out.println("2- Division");
        System.out.println("3- Subtraction");
        System.out.println("4- Addition");
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        showMenu();

        int choice = scanner.nextInt();
        int result = 0;
        double divisionResult = 0;
        String operator = " ";

        if (choice == 1) {
            result = multiply(a, b);
            operator = "*";
        } else if (choice == 2) {
            if (b == 0) {
                System.out.println("Cannot divide by zero!");
                scanner.close();
                return;
            }
            divisionResult = divide(a, b);
            operator = "/";
        } else if (choice == 3) {
            result = subtract(a, b);
            operator = "-";
        } else if (choice == 4) {
            result = add(a, b);
            operator = "+";
        } else {
            System.out.println("Invalid operation!");
            scanner.close();
            return;
        }


        if (choice == 2) {
            System.out.println(a + " " + operator + " " + b + " = " + divisionResult);
        } else {
            System.out.println(a + " " + operator + " " + b + " = " + result);
        }

        scanner.close();
    }
}
