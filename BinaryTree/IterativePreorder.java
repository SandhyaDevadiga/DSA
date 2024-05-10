                            
import java.util.*;

// Define the TreeNode structure
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
  public List<Integer> preorderTraversal(TreeNode root){
    List<Integer> preorder =new ArrayList<>();
     if(root==null){
        return preorder;
     }
     Stack <TreeNode> st=new Stack<>();
     st.push(root);
     while(!st.empty()){
        root=st.pop();
        preorder.add(root.val);
        if(root.right!=null){
            st.push(root.right);
        }
        if(root.left!=null){
            st.push(root.left);
        }
     }
     return preorder;
  }
}

public class IterativePreorder {
    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Initializing the Solution class
        Solution sol = new Solution();

        // Getting the preorder traversal
        List<Integer> result = sol.preorderTraversal(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
                            
                        