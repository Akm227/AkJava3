package week1.thursday;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("write number1");
        double number8 = scanner6.nextDouble();
        System.out.println("wite number2");
        double number9 = scanner6.nextDouble();
        System.out.println("write number3");
        double number10 = scanner6.nextDouble();
        double mean = (number8 + number9 + number10) / 3;
        System.out.println("answer:");
        System.out.println(mean);

    }
}
