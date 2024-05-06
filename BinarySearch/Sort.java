import java.util.*;
public class Sort{
    public static void SortArray(int [] arr){
       int low=0, mid=0, high=arr.length-1;
       int temp=0;
       while(mid<=high){
        if(arr[mid]==0){
            temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
        }
        else if(arr[mid]==1){
          mid++;
        }
        else{
           temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
            high--; 
        }
       }
    }
    

    public static void main(String[] args){
    int [] arr = {0, 2, 1, 2, 0, 1};
    SortArray(arr);
    System.out.println("after sorting");
    for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i]+" ");
    }

    }
}