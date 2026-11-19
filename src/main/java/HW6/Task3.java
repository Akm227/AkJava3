package HW6;

public class Task3 {
    public class Main {

        static boolean canVote(int age) {
            return age >= 18;
        }

        public static void main(String[] args) {
            System.out.println(canVote(20));
            System.out.println(canVote(15));
        }
    }
}