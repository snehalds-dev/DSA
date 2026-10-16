package recursion;

public class SumN {

    // Sum of natural numbers using recursion
    // TC: O(n)
    // SC: O(n)
    private static int sum(int n) {
        if(n == 1) {
            return 1;
        }

        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int n = 1000;
        int ans = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + ans);
    }
}