
import java.io.*;

class PrintLCS{


    static String lcs(String X, String Y, int m, int n, int dp[][]) {
        StringBuilder res = new StringBuilder();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                res.append(X.charAt(i - 1)); // Corrected index to i-1
                i--;
                j--;
            } else {
                if (dp[i][j - 1] > dp[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        // Reverse the result to get the correct LCS
        return res.reverse().toString();
    }

    // Driver code
    public static void main(String args[]) {
        String X = "abcdeh";
        String Y = "abedfh";

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the dp table for LCS calculation
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Print the longest common subsequence
        System.out.println("Longest common subsequence: " + lcs(X, Y, m, n, dp));
    }
}