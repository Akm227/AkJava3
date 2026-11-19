package HW8;

public class Task2 {
    static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 2;
        array[1] = 7;
        array[2] = 11;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
}