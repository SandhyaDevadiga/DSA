import java.util.*;

public class Sorted2D{
    public static boolean SearchEle(ArrayList<ArrayList<Integer>> arr,int target){
        int n=arr.size();
        int m=arr.get(0).size();
        // int low=0;
        // int high=n*m -1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     int row=mid/m; int col=mid%m;
        //    if (arr.get(row).get(col) == target) return true;
        //     else if (arr.get(row).get(col) < target) low = mid + 1;
        //     else high = mid - 1;

        int row=0, col=m-1;
        while(row < n && col >= 0){
            if(arr.get(row).get(col) == target) return true;
            else if (arr.get(row).get(col) < target) row++;
            else col--;
        }
        
        return false;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
       matrix.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
       matrix.add(new ArrayList<>(Arrays.asList(5,6,7,8)));
       matrix.add(new ArrayList<>(Arrays.asList(9,10,11,12)));
       boolean result = SearchEle(matrix, 8);
        System.out.println(result ? "true" : "false");
    }
}