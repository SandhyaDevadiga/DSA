import java.io.*;
class patternMatchSS{
    static int lcs(String X, String Y, int m, int n, int dp[][])
                
    {  for(int i=0; i<m+1; i++)
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

    public static void main(String args[])
    {
        String X = "AGGTS";
        String Y = "AGGTBS";

        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        System.out.println("Length of LCS is "
                           + lcs(X, Y, m, n, dp));
        int res= lcs(X, Y, m, n, dp);
        if(res==m){
         System.out.println("true");
        }
        else
        System.out.println("false");
    }
}

