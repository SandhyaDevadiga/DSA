import java.util.*;

public class KokoEat{
    public static int findMax(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max,arr[i]);
        }
       return max;
    }
    public static int CalculateTime(int[] arr, int hourly){
        int totalH = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
           totalH+=Math.ceil((double)(arr[i])/(double)(hourly));
        }
        return totalH;
    }
    public static int findKokoBanana(int[] arr, int h){
      int low=1, high=findMax(arr);
      while(low<=high){
        int mid=(low+high)/2;
        int totalH=CalculateTime(arr,mid);
        if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
      
    }
     public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans =findKokoBanana(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
     }
}