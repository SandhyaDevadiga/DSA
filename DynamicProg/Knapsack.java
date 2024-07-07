// 0/1 knapsack problem
// recurion code
import java.util.*;
class Knapsack{
public static int knapsack(int wt[], int val[], int W, int n){
    if(n==0|| W==0){
        return 0;
    }
    if(wt[n-1]<=W){
     return Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt,val, W, n-1));
     
    }
    else
    return knapsack(wt,val, W, n-1);
}
 public static void main(String args[])
    {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = profit.length;
        System.out.println(knapsack( weight, profit, W,n));
    }
}

// MEMOIZATION
int knapsack(int wt[], int val[], int W, int n){
    int static dp[n][W];

    if(n==0|| w==0){
        return 0;
    }
    if(dp[n][w] !=-1){
        return dp[n][w];
    }
    if(wt[n-1]<=W){
     return dp[n][w]=max[val[n-1]+knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt,val, W, n-1)];
     
    }
    else if(wt[n-1]>W)
    return dp[n][w]=knapsack(wt,val, W, n-1);
}
