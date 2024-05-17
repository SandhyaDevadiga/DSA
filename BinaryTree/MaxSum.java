import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class MaxSum {
    int findMaxPathSum(Node root, int[] maxi) {

        if (root == null) {
            return 0;
        }
        int leftMaxPath=Math.max(0, findMaxPathSum(root.left,maxi));
        int rightMaxPath=Math.max(0, findMaxPathSum(root.right,maxi));
        maxi[0]=Math.max(maxi[0], leftMaxPath+rightMaxPath+root.data);
        return Math.max(leftMaxPath, rightMaxPath) + root.data;
    }
    int maxPathSum(Node root){
        int [] maxi={Integer.MIN_VALUE};
        findMaxPathSum(root, maxi);
        return maxi[0];
    }
   
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        // Creating an instance of the Solution class
        MaxSum solution = new MaxSum();

        // Finding and printing the maximum path sum
        int maxPathSum = solution.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + maxPathSum);
    }
}
                            
                        