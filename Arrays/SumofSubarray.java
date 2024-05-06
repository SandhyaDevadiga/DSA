import java.util.*;

class SumofSubarray{
    public static int subarray(int[] arr, int k){
        int n=arr.length;
        int cnt=0;
        for(int i=0; i<n; i++){
            int sum=0;
             for(int j=i; j<n; j++){
                sum+=arr[j];

                if(sum==k)
                 cnt++;
             }
        }
        
        return cnt;
    }
    public static void main(String args[]) {
        int[] arr={1,2,3,4,5,6,7,0};
        int k=6;
        int ans=subarray(arr,k);
        System.out.println("sum of subarray is "+ans);
    }
}