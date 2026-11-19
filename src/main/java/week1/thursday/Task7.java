package week1.thursday;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("write number1:");
        double number4 = scanner3.nextDouble();
        System.out.println("write number2:");
        double number5 = scanner3.nextDouble();
        double area = number4 * number5;
        double perimeter = 2 * (number4 + number5);
        System.out.println("area;");
        System.out.println(area);
        System.out.println("perimeter;");
        System.out.println(perimeter);
    }
}
