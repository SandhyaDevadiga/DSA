                            
import java.util.ArrayList;
import java.util.List;

// TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class RootToNode {
     public boolean getPath(TreeNode root, List<Integer> arr, int x) {
     if(root==null){
        return false;
     }
     arr.add(root.val);
     if(root.val==x){
        return true;
     }
     if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }
    public List<Integer> solve(TreeNode A, int B) {
     List<Integer> arr=new ArrayList<>();
     if(A==null){
        return arr;
     }
     getPath(A, arr,B);
     return arr;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        RootToNode sol = new RootToNode();

        int targetLeafValue = 7;

        List<Integer> path = sol.solve(root, targetLeafValue);

        System.out.print("Path from root to leaf with value " +
                targetLeafValue + ": ");
        for (int i = 0; i < path.size(); ++i) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) {
                System.out.print(" -> ");
            }
        }
    }
}
                            
                        