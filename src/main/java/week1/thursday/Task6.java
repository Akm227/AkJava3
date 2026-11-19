package week1.thursday;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write user name;");
        String userName = scanner.nextLine();
        System.out.println("Write assistantName;");
        String assistantName = scanner.nextLine();
        System.out.println("Write messages;");
        int messages = scanner.nextInt();
        System.out.println(assistantName + ";" + userName + ", you have " + messages + " new messages.");
    }
}
