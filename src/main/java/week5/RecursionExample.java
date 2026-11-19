package week5;

public class RecursionExample {
    static void recursion(int x){
        if (x<=0){
            System.out.println("exit");
            return;
        }
        recursion(9);
    }
    static void main(){
        recursion(3);
    }
}
