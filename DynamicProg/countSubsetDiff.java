import java.util.*;

class countSubsetDiff {
    public static int countDiff(int[] arr, int n, int diff){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        int s1=(diff+sum)/2;
        // int s2=s1-diff;
        return countsubset(arr, s1,n);
    }
    public static int countsubset(int arr[],  int sum, int n) {
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
        int set[] = new int[] {1,2,3,1,2};
        int diff=1;
        int n = set.length;
      System.out.println(countDiff(set, n, diff));
    }
}