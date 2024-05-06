import java.util.*;

public class SquareRoot{
    public static int floorSqrt(int n) {
        int low = 1, high = n;
        //Binary search on the answers:
        while (low <= high) {
            int mid = (low + high) / 2;
            int val = mid * mid;
            if (val <= n) {
                //eliminate the left half:
                low = (mid + 1);
            } else {
                //eliminate the right half:
                high =(mid - 1);
            }
        }
        return high;
    }
    
    public static void main(String[] args){
    
    int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}