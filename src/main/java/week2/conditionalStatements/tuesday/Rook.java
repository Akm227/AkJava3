package week2.conditionalStatements.tuesday;

import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write row1");
        int row1 = scanner.nextInt();
        System.out.println("Write col1");
        int col1 = scanner.nextInt();
        System.out.println("Write row2");
        int row2 = scanner.nextInt();
        System.out.println("Write col2");
        int col2 = scanner.nextInt();

        if (row1 == row2 || col1 == col2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
