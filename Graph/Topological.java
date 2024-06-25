 import java.util.*;
 class Topological{
    private static void dfs(int node, boolean vis[], Stack<Integer>st, ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;     // for int initialisation, vis[node]=1;   and for false vis[i]==false like that
        for(int it:adj.get(node)){
            if(vis[it]==false){
                dfs(it, vis, st, adj);
            }
        }
        st.push(node);
    }
    public static int[] topo(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[V]; // OR u can initalise as int --> int vis[]=new int[V]
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0; i<V; i++){
            if(vis[i]==false){
                dfs(i, vis, st, adj);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]=st.peek();
            st.pop();

        }
        return ans;
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
        int [] ans=Topological.topo(V,adj);
        for(int node:ans){
            System.out.println(node+" ");
        }
            System.out.println("");
    }
 }