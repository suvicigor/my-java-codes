package vezbe_1;

import java.util.Scanner;

public class Fibonaci {
    public static int fibonaci(int n) {
        if(n == 1 || n == 2)
        {
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            n = sc.nextInt();
            System.out.println(n + "-ti fibonacijev broj je: " + fibonaci(n));
        }
    }
}
