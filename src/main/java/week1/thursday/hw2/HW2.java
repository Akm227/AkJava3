package week1.thursday.hw2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

            System.out.println("---Task1---");
            Scanner scanner = new Scanner(System.in);
            System.out.println("write temperature;");
            int temperature = scanner.nextInt();
            System.out.println("The air temperature today is: "
                    + temperature + " degrees.");

            System.out.println("---TASK2---");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("write year:");
            int year = scanner1.nextInt();
            System.out.println("write month:");
            int month = scanner1.nextInt();
            System.out.println("write day:");
            int day = scanner1.nextInt();
            System.out.println(day + ":" + month + ":" + year);

            System.out.println("---TASK3---");
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Write number1");
            double number1 = scanner2.nextDouble();
            System.out.println("Write number2");
            double number2 = scanner2.nextDouble();
            double area = number1 * number2;
            double perimeter = 2 * (number1 + number2);
            System.out.println("AREA:"+area);
            System.out.println("PERIMETER:"+perimeter);


            System.out.println("---TASK4---");
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Write radius:");
            double number = scanner3.nextDouble();
            double area1 = Math.PI * number * number;
            double circumference = 2 * Math.PI * number;
            System.out.println("Area of the circle: " + area1);
            System.out.println("Circumference of the circle: " + circumference);

            System.out.println("---TASK5---");
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Write number:");
            double x = scanner4.nextDouble();
            double y = 5 * x * x + 2 * x + 11;
            System.out.println(y);
            System.out.println("the end👐🫶");
        }
    }
