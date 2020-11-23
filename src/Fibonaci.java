package practice_1;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            n = sc.nextInt();
            System.out.println(n + "-th fibonacci number is: " + fibonacci(n));
        }
    }
}
