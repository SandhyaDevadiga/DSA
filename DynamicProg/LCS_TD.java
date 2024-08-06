
import java.io.*;

class LCS_TD {


    static int lcs(String X, String Y, int m, int n, int dp[][])
                
    {
        // int dp[][] = new int[m + 1][n + 1];

        for(int i=0; i<m+1; i++)
        {
            for(int j=0; j<n+1; j++){
                if(i==0|| j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1; i<m+1; i++)
        {
            for(int j=1; j<n+1; j++){
                if (X.charAt(i - 1) == Y.charAt(j- 1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    // Drivers code
    public static void main(String args[])
    {

        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        // for (int i = 0; i < m + 1; i++) {
        //     for (int j = 0; j < n + 1; j++) {
        //         dp[i][j] = -1;
        //     }
        // }

        System.out.println("Length of LCS is "
                           + lcs(X, Y, m, n, dp));
    }
}

