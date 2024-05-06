import java.util.*;

public class MergeArray{
    public static void Swap(int[] arr1, int[] arr2, int i, int j){
      
      if (arr1[i] > arr2[j]){
      int temp=arr1[i];
      arr1[i]=arr2[j];
      arr2[j]=temp;
      }
    }
    public static void Merge(int[] arr1, int[] arr2, int n, int m){
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if (left < n && right >= n){
                    Swap(arr1, arr2, left,right-n);
                }
                else if(left>=n){
                    Swap(arr2, arr2, left-n,right-n);
                }
                else{
                     Swap(arr1, arr1, left,right);
                }
                left++; right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }

    }
    public static void main(String args[]){
        int[] arr1 = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        Merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    

    }
}