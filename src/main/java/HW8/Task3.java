package HW8;

public class Task3 {

    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 247;
        array[2] = 6;

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}