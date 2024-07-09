import java.util.*;

class SumofSubset {
    public static boolean subset(int arr[],  int sum, int n) {
       boolean t[][] = new boolean[n + 1][sum + 1];

         for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if(i==0){
                    t[i][j]=false;
                }
                 if(j==0){
                    t[i][j]=true;
                }
            }
        }
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
               if (arr[i - 1] <= j) {
                    t[i][j] = t[i-1][j-arr[i-1]]||t[i-1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
    public static void main(String args[]) {
        int set[] = new int[] { 3,34,4,12,5 };
        int sum = 9;
        int n = set.length;
        if (subset(set, sum, n)==true){
            System.out.println("Found a subset "+ " with given sum");
        }
        else{
             System.out.println("No subset  with given sum");
        }
    }
}