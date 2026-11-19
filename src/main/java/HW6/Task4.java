package HW6;

public class Task4 {
    public class Main {

        static double calculateAverage(int a, int b, int c) {
            return (a + b + c) / 3.0;
        }

        public static void main(String[] args) {
            double result = calculateAverage(5, 10, 20);
            System.out.println(result);
        }
    }
}