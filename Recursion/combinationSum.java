import java.io.*;
import java.util.*;
class combinationSum{

    private static void findCombinations(int i, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
         if(i==arr.length){
            if(target==0){
              ans.add(new ArrayList<>(ds));
            }
            return;
          }
        //   this is for picking up index value 
          if(arr[i]<=target){
              ds.add(arr[i]);
               findCombinations(i,arr,target-arr[i],ans,ds);
               ds.remove(ds.size()-1);
          }
           findCombinations(i+1,arr,target,ans,ds);
    }
    public static List < List < Integer >> combSum(int [] canidates, int target){
        List < List < Integer >> ans=new ArrayList<>();
        findCombinations(0,canidates,target,ans,new ArrayList<>());
        return ans;
    }
 public static void main(String[] args) {
        int arr[] = {2,4,6,7};
        int target = 6;
        combinationSum sol = new combinationSum();
        List < List < Integer >> ls = sol.combSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
        