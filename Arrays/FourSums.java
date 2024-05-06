import java.util.*;

public class FourSums{
    public static ArrayList<ArrayList<Integer>> Sums(int[] arr, int target){
        int n=arr.length;

        ArrayList<ArrayList<Integer>> ans=new  ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            if(i>0&& arr[i]==arr[i-1])
            continue;
            for(int j=i+1; j<n; j++){
                if(j>i+1 && arr[j]==arr[j-1])
                continue;

                int k=j+1;
                int l=n-1;
                while(k<l){
                long sum=0;
                 sum+=arr[i]+arr[j]+arr[k]+arr[l];
                // sum+=arr[j];
                // sum+=arr[k];
                // sum+=arr[l];
                if(sum==target){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                     temp.add(arr[j]);
                      temp.add(arr[k]);
                       temp.add(arr[l]);
                       ans.add(temp);
                       k++;
                       l--;
                
                while(k<l && arr[k]==arr[k-1])
                k++;
                while (k < l && arr[l] == arr[l + 1]) l--;
                }
                else if (sum < target) k++;
                    else l--;
                }
            }
        }
        return ans;

    }
    public static void main(String args[]) {
         int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        ArrayList<ArrayList<Integer>> ans =Sums(nums, target);
        System.out.println("The quadruplets are: ");
         System.out.print(ans);
        //for (ArrayList<Integer> it : ans) {
        //     System.out.print("[");
        //     for (int ele : it) {
        //         System.out.print(ele + " ");
        //     }
        //    System.out.print("] ");
        // }
       // System.out.println();
    
    }
    }
