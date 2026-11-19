package HW6;

public class Task2 {
    public class Main {

        static double calculateDiscount(double price, double discountPercent) {
            return price - (price * discountPercent / 100);
        }

        public static void main(String[] args) {
            double result = calculateDiscount(200, 15);
            System.out.println(result);
        }
    }
}