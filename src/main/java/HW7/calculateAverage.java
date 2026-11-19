package HW7;

public static void calculateAverage() {
    int[] numbers = new int[5];

    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = (i + 1) * 10;
    }

    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
    }

    double average = (double) sum / numbers.length;

    System.out.println("Average: " + average);
}

public static void main(String[] args) {
    calculateAverage();
}