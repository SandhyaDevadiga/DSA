import java.util.*;
class SumSub{
    public static void subsetSumsHelper(int i, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        if(i==N){
           sumSubset.add(sum);
           return; 
        }
        subsetSumsHelper(i+1,sum+arr.get(i), arr, N,sumSubset);
        subsetSumsHelper(i+1,sum, arr, N,sumSubset);
    }
     public static ArrayList < Integer > SubsetSum(ArrayList < Integer > arr, int N){
        ArrayList < Integer > sumSubset=new ArrayList<>();
         subsetSumsHelper(0,0,arr,N,sumSubset);
         Collections.sort(sumSubset);
         return sumSubset;
     }
     public static void main(String args[]) {


        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = SubsetSum(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}