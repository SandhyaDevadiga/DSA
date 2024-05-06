import java.util.*;

public class BinarySearch{
    public static int Search(int[] arr, int target){
        int n=arr.length;
       int left=0;
       int right=n-1;
       while(left<=right){
         int mid=(left+right)/2;
           if(arr[mid]==target){
            return mid;
           }
           else if(arr[mid]>target){
            right=mid-1;
           }
           else
            left=mid+1;
           
       }
     return -1;
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = Search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
    }
