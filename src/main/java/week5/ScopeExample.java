package week5;

import java.util.Scanner;

public class ScopeExample {
    static Scanner sc = new Scanner(System.in);
    static int sum1;

    static void sum(int a, int b) {
        sum1 = a + b;
        System.out.println(sum1);
    }

    static boolean area(int a, int b) {
        sum1 = a + b;
        return sum1 % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(area(6, 7));
    }
}
