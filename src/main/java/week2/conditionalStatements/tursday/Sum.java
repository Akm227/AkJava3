package week2.conditionalStatements.tursday;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println((a + b) % 2 == 0 && (a * b) % 2 != 0);
    }
}
