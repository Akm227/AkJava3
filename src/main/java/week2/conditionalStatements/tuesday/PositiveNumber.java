package week2.conditionalStatements.tuesday;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number:");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
