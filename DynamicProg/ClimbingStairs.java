import java.util.*;
class ClimbingStairs{
    static int f(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        // int left=f(n-1);
        // int right=f(n-2);
        // return left+right;
        return f(n-1)+f(n-2);
    }
    public static int count(int s){
        return f(s+1);
    }
    public static void main(String[] args){
        int n=3;
        
        System.out.println("no of ways=");
        System.out.println(count(n));
    }
}