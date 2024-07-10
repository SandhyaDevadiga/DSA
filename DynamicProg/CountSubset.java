import java.util.*;

class CountSubset {
    public static int subset(int arr[],  int sum, int n) {
       int t[][] = new int[n + 1][sum + 1];

         for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if(i==0){
                    t[i][j]=0;
                }
                 if(j==0){
                    t[i][j]=1;
                }
            }
        }
       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
               if (arr[i - 1] <= j) {
                    t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
    public static void main(String args[]) {
        int set[] = new int[] {  3, 5,6, 8, 10,2};
        int sum = 10;
        int n = set.length;
      System.out.println((subset(set, sum, n)));
    }
}