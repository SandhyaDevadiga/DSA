import java.util.*;

public class Subarray{
    public static int MaxSubarray(int [] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
         sum+=arr[i];
         if(sum>max){
            max=sum;
         }  
         if(sum<0){
            sum=0;
         }
        }
        return max;
    }

    public static void main(String args[]) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=MaxSubarray(arr);
        System.out.println("The maximum subarray sum is:"+maxsum);
    }
}