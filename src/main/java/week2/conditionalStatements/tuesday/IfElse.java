package week2.conditionalStatements.tuesday;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write word:");
        String input = scanner.nextLine();

        if (input.equals("System.out.println()")) {
            System.out.println("This is a command used to print output.");
        } else if (input.equals("if")) {
            System.out.println("This is a conditional operator.");
        } else if (input.equals("else")) {
            System.out.println("This is an alternative part of a conditional statement.");
        } else {
            System.out.println("Раздел в разработке");
        }
    }
}
