import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a positive integer.");
        int n = scanner.nextInt();
        System.out.println(recursiveFibonacci(n));
        System.out.println(iterativeFibonacci(n));
    }

    public static int recursiveFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int iterativeFibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 1; i < n; i++){
            c = a + b;
            a= b;
            b = c;
        }
        return c;
    }

}