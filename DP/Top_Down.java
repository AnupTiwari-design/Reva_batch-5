package DP;
import java.util.*;
public class Top_Down {
   

    static int[] dp;

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacci(n));
    }

    
}
