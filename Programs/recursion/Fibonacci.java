package recursion;

import java.util.Arrays;

public class Fibonacci {

    private static int[] fibarr;

    private static int fib(int n) {
        if(n == 0 || n == 1) {
            fibarr[n] = n;
            return fibarr[n];
        }

        if(fibarr[n] != -1) {
            return fibarr[n];
        }

        fibarr[n] = fib(n-1) + fib(n-2);
        return fibarr[n];
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series with first " + n + " terms is: ");

        fibarr = new int[n];
        Arrays.fill(fibarr, -1);
        for(int i = 0; i < n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}

// Recurrence relation:
// T(n) = T(n-1) + T(n-2) + O(1)

// Uses Recursion + Memoization(Top-Down Approach)
// TC: O(n) ==> (Without memoization: O(2^n))
// SC: O(n)
