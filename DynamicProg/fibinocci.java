// MEMOIZATION METHOD-- TOP DOWN APPROACH
import java.util.*;
// class fibinocci{
//     public static int fib(int n, int []dp){
//         if(n<=1)
//         return n;
//         if(dp[n]!=-1)
//         return dp[n];
//         return dp[n]=fib(n-1,dp)+fib(n-2, dp);
//     }
//     public static void main(String[] args){
//         int n=5;
//         int dp[]=new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(fib(n,dp));
//     }
// }


//TABULATION METHOD-- BOTTUM UP METHOD
class fibinocci{
    public static void main(String[] args){
        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(int i=1; i<=n; i++){
        System.out.print(dp[i]);
        System.out.print(' ');
        }
    }
}