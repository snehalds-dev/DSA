package patterns;

import java.util.Scanner;

public class SolidRectangle {

    // TC: O(n*m)
    // SC: O(1)
    private static void printSolidRectangle(int m, int n) {

        for(int i = 0; i< n; i++) {
            for(int j=0; j< m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int m, n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 values, length & breadth: ");
        m = sc.nextInt();
        n =  sc.nextInt();

        printSolidRectangle(m, n);
    }
}
