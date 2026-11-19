package week4.methods;

public class Practice1 {
    static void printName() {
        System.out.println("aiana");
    }

    static int square(int n) {
        return n * n;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        printName();
        int result1 = square(2);
        int result = multiply(3, 5);
        System.out.println(result +
                " " + result1);
        System.out.print(isEven(4));
    }
}
