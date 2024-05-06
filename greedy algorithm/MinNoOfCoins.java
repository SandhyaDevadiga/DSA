// Find minimum number of coins
// Problem Statement: Given a value V, if we want to make a change for V Rs, and we have an infinite supply of each of the denominations in Indian currency, i.e., we have an infinite supply of { 1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes, what is the minimum number of coins and/or notes needed to make the change.

import java.util.*;
public class MinNoOfCoins {
  public static void main(String[] args) {
    int V=49;
    ArrayList <Integer> ans=new ArrayList<>();
    int array[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
    int n=array.length;
    for(int i=n-1; i>=0; i--){
        while(V>=array[i]){
            V-=array[i];
            ans.add(array[i]);
        }
    }

    System.out.println("The minimum number of coins is "+ans.size());
    System.out.println("The coins are ");
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(" " + ans.get(i));
    }

  }
}