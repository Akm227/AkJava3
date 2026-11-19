package week4.methods.hw4;

public class HomeWork {
    public class Tasks {
        //todo task-1
        public static void printFullName(String firstName, String lastName) {
            System.out.println(firstName + " " + lastName);
        }


        //todo task-2
        public static double calculateDiscount(double price, double discountPercent) {
            return price - (price * discountPercent / 100);
        }


        //todo task-3
        public static boolean canVote(int age) {
            return age >= 18;
        }


        //todo task-4
        public static double calculateAverage(int a, int b, int c) {
            return (a + b + c) / 3.0;
        }


        //todo task-5
        public static double convert(int number) {
            return number * 2.0;
        }
        public static double convert(double number) {
            return number * 3;
        }
        public static String convert(String text) {
            return "Converted: " + text;
        }



        //todo task-6
        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static int countEven(int a, int b, int c) {
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
            System.out.print("task1: ");
            printFullName("Alim", "Akimov");

            System.out.println("task2: "+calculateDiscount( 200, 15));

            System.out.println("task3: "+canVote(20));

            System.out.println("task4: "+calculateAverage(5, 10, 20));
            System.out.println("task5: ");
            System.out.println(convert(5));
            System.out.println(convert(2.5));
            System.out.println(convert("Hello"));
            System.out.println("task6: ");
            System.out.println(isEven(8));
            System.out.println(countEven(2, 5, 8));
        }
    }

}
