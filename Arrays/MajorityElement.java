import java.util.*;

public class MajorityElement{
    public static List<Integer> MajorEle(int[] arr){
     int n =arr.length;
     int min=(n/3)+1;
      List<Integer> ans = new ArrayList<>();
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0; i<n; i++){
         int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        if(map.get(arr[i])==min){
           ans.add(arr[i]);
        }
        if (ans.size() == 2) break;
     }
     return ans;
    }
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans =MajorEle(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    
    }
}