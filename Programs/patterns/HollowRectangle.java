package patterns;

import java.util.Scanner;

public class HollowRectangle {

    // TC: O(n*m)
    // SC: O(1)
    private static void printHollowRectangle(int m, int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || i == n || j==1 || j == m) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
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

        printHollowRectangle(m, n);
    }
}
