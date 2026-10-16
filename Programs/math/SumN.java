package math;

import java.util.Scanner;

public class SumN {

    // Sum of natural numbers using formula
    // TC: O(1)
    // SC: O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = n * (n + 1) / 2;
        System.out.println("Sum of first " + n + " natural numbers is: " + ans);
    }
}
