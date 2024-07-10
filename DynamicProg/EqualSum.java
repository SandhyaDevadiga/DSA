import java.util.*;

class EqualSum {
   public static boolean equalsum(int arr[], int n){
        int sum=0;
        for(int i=0;i<n; i++)
            sum=sum+arr[i];
        
         if(sum%2!=0){
                return false;
            }
        return subset(arr, sum/2, n);
   }
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
        int set[] = new int[] { 1,5,11,2 ,3};
        int n = set.length;
        if (equalsum(set, n)==true){
            System.out.println("can be divided into equal sum");
        }
        else{
             System.out.println("can't be divided");
        }
    }
}