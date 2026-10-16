package patterns;

import java.util.Scanner;

public class FloydTriangle {

    // TC: O(n^n)
    // SC: O(1)
    private static void printFloydTriangle(int rows) {
        int val = 1;

        for(int i = 1; i<= rows; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in Floyd Triangle: ");
        int rows = sc.nextInt();

        printFloydTriangle(rows);
    }
}
