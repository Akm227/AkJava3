package week3.loops.tursday;

import java.util.Scanner;

public class Main {
    public static void evenNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        evenNumbers(a, b);
    }
}
