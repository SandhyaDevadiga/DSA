import java.util.*;
class TopoCyclic{
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        int indegree[]=new int[V];
        for(int i=0; i<V; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> Q=new LinkedList<Integer>();
        for(int i=0; i<V; i++){
            if(indegree[i]==0){
                Q.add(i);
            }
        }
        int cnt=0;
        while(!Q.isEmpty()){
            int node=Q.peek();
            Q.remove();
            cnt++;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                Q.add(it);
            }
        }
        if(cnt==V)
        return false;
        return true;
    }
     public static void main(String[] args){
        int V=6;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        System.out.println(TopoCyclic.isCycle(V,adj));
        
    }
}