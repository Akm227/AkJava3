package week2.conditionalStatements.tuesday;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Write the word");
                String word = scanner.nextLine();

                int length = word.length();

                switch (length) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    default:
                        System.out.println("Long word");
                }
            }
        }
