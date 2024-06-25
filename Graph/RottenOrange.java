import java.util.*;
class RottenOrange{

  private boolean dfs(int node, int col, int color[],ArrayList<ArrayList<Integer>>adj){
    color[node]=col; //always color the node with given color
    for(int it:adj.get(node)){
        if(color[it]==-1) //if adjacency element of that node is not colored 
        {
            if(dfs(it,1-col, color, adj)==false)
                return false; 
        }
        else if(color[it]==col){
            return false;
        }
    }
    return true;
  }
    public boolean Rotten(int V, ArrayList<ArrayList<Integer>>adj)
    {
        int color[]=new int[V];
        for(int i=0; i<V; i++){
            color[i]=-1;
        }
        for(int i=0; i<V; i++){
           if( color[i]==-1){
                if(dfs(i,0, color, adj)==false)
                return false;
           }
        }
        return true;
    }
}