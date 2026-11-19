package HW7;

public class LargestNumber {
    public static void calculateSum() {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        calculateSum();
    }
}