package week1.thursday;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("write number:");
        int n = scanner5.nextInt();
        System.out.println("answer:");
        System.out.println(+n + " " + (n * n) + " " + (n * n * n));

    }
}
