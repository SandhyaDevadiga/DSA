import java.util.*;
import java.lang.*;
import java.io.*;

class Pair {
  int node, distance;
  Pair(int distance, int node) {
    this.node = node;
    this.distance = distance;
  }
}
//User function Template for Java
class Solution {
public static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
    PriorityQueue<Pair> pq=new PriorityQueue<Pair>((x,y)->x.distance-y.distance);
    int [] vis=new int[V];
    pq.add(new Pair(0,0));
    int sum=0;
    while(pq.size()>0){
        int wt=pq.peek().distance;
        int node=pq.peek().node;
        pq.remove();

        if(vis[node]==1)
        continue;
        vis[node]=1;
        sum+=wt;
        for(int i=0; i<adj.get(node).size(); i++){
            int adW=adj.get(node).get(i).get(1);
            int adjnode=adj.get(node).get(i).get(0);
            if(vis[adjnode]==0){
                pq.add(new Pair(adW,adjnode));
            }
        }
    }
    return sum;
}
}