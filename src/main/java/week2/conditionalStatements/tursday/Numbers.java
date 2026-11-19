package week2.conditionalStatements.tursday;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int count = 0;

        if (a % 2 == 0) {
            count++;
        }

        if (b % 2 == 0) {
            count++;
        }

        if (c % 2 == 0) {
            count++;
        }

        System.out.println(count == 2);
    }
}
