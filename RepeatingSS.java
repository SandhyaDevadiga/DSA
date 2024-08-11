// Input: str = "abc"
// Output: 0
// There is no repeating subsequence

// Input: str = "aab"
// Output: 1
// The two subsequence are 'a'(first) and 'a'(second). 
// Note that 'b' cannot be considered as part of subsequence 
// as it would be at same index in both.



import java.io.*;

class RepeatingSS {


    static int findLongestRepeatingSubSeq(String X, int n, int dp[][])
                
    {
        
        for(int i=0; i<n+1; i++)
        {
            for(int j=0; j<n+1; j++){
                if(i==0|| j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<n+1; j++){
                if (X.charAt(i - 1) == X.charAt(j- 1)&& i!=j)
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][n];
    }

    // Drivers code
    public static void main(String args[])
    {

         String str = "AABEDCDD";
         int n=str.length();
         int dp[][]=new int[n+1][n+1];
         
        System.out.println("The length of the largest subsequence that"
            +" repeats itself is : "+findLongestRepeatingSubSeq(str, n, dp));
    }
}

