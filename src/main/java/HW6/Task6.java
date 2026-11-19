package HW6;

public class Task6 {
    public class Main {

        static boolean isEven(int n) {
            return n % 2 == 0;
        }

        static int countEven(int a, int b, int c) {
            int count = 0;

            if (isEven(a)) {
                count++;
            }

            if (isEven(b)) {
                count++;
            }

            if (isEven(c)) {
                count++;
            }

            return count;
        }

        public static void main(String[] args) {
            System.out.println(isEven(8));

            System.out.println(countEven(2, 5, 8));
        }
    }
}