 import java.util.*;
public class SearchInsert {
    //static int findFloor(int[] arr, int n, int x) {
    //     int low = 0, high = n - 1;
    //     int ans = -1;

    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //         // maybe an answer
    //         if (arr[mid] <= x) {
    //             ans = arr[mid];
    //             //look for smaller index on the left
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1; // look on the right
    //         }
    //     }
    //     return ans;
    // }

    // static int findCeil(int[] arr, int n, int x) {
    //     int low = 0, high = n - 1;
    //     int ans = -1;

    //     while (low <= high) {
    //         int mid = (low + high) / 2;
    //         // maybe an answer
    //         if (arr[mid] >= x) {
    //             ans = arr[mid];
    //             //look for smaller index on the left
    //             high = mid - 1;
    //         } else {
    //             low = mid + 1; // look on the right
    //         }
    //     }
    //     return ans;
    // }
    // public static int[] getFloorAndCeil(int[] arr, int n, int x) {
    //     int f = findFloor(arr, n, x);
    //     int c = findCeil(arr, n, x);
    //     return new int[] {f, c};
    // }
        public static int solve(int key, int[] v) {
           int n=v.length;
           int res=-1;
           for(int i=n-1; i>=0; i--){
            if(v[i]==key){
            res=i;
             break;
            }
           }
           return res;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int key=4;
        //int n = 6, x = 5;
        // int[] ans = getFloorAndCeil(arr, n, x);
        // System.out.println("The floor and ceil are: " + ans[0]
        //                    + " " + ans[1]);
        System.out.println(solve(key, arr));
    }

} 