package HW6;

public class Task5 {

    static double convert(int number) {
        return number * 2.0;
    }

    static double convert(double number) {
        return number * 3;
    }

    static String convert(String text) {
        return "Converted: " + text;
    }

    public static void main(String[] args) {

        System.out.println(convert(10));
        System.out.println(convert(5.5));
        System.out.println(convert("Hello"));

    }
}