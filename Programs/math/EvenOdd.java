package math;

import java.util.Scanner;

public class EvenOdd {

    // Using modulo operator
    // TC: O(1)
    // SC: O(1)
    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    // Using bitwise AND operator
    // TC: O(1)
    // SC: O(1)
    // Bitwise operators are extremely fast and efficient because they operate directly at the binary level
    // Significantly faster than arithmetic and logical operators
    private static boolean isEven2(int num) {
        if ((num & 1) == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isEven2(n)) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
    }
}
