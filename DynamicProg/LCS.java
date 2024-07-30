// A Naive recursive implementation of LCS problem in java

import java.io.*;
import java.util.*;

public class LCS {

    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    int LongestCommonSubsequence(String X, String Y, int m, int n)
    {
        if(m==0||n==0){
            return 0;
        }
        if(X.charAt(m-1)==Y.charAt(n-1)){
            return 1+LongestCommonSubsequence(X,Y,n-1, m-1);
        }
        else{
            return Math.max(LongestCommonSubsequence(X,Y,n, m-1), LongestCommonSubsequence(X,Y,n-1, m));
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        LCS lcs
            = new LCS();
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();

        System.out.println("Length of LCS is"
                           + " " + lcs.LongestCommonSubsequence(S1, S2, m, n));
    }
}
