import java.util.*;
class FrogjumpK{
    public static void solve(int n, int[] height, int [] dp, int k){
      
        Arrays.fill(dp, -1);
        dp[0]=0;
        for(int i=1; i<n; i++){
            int minjump=Integer.MAX_VALUE;
            for(int j=1; j<=k; j++){
           if(i-j>=0){
            int jump=dp[i-j]+Math.abs(height[i]-height[i-j]);
            minjump=Math.min(jump, minjump);
           }
            }
            dp[i]=minjump;
        }
        System.out.println(dp[n-1]);
    }
    public static void main(String args[]){

        int height[]={30,10, 60, 10, 60, 50};
        int n=height.length;
        int k=2;
        int dp[]=new int[n];
        solve(n,height,dp,k);
    }
}