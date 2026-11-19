package week2.conditionalStatements.tuesday;

import java.util.Scanner;

public class Middile {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write number1");
        int a = scanner.nextInt();
        System.out.println("Write number2");
        int b = scanner.nextInt();
        System.out.println("Write number3");
        int c = scanner.nextInt();

        int median;

        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            median = a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            median = b;
        } else {
            median = c;
        }

        System.out.println(median);

    }
}
