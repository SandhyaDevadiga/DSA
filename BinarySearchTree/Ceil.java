                            
// Importing necessary packages
import java.util.*;

// Definition of TreeNode structure for a binary tree node
class TreeNode {
    // Value of the node
    int val;

    // Pointer to the left child node
    TreeNode left;

    // Pointer to the right child node
    TreeNode right;

    // Constructor to initialize the node with a
    // value and set left and right pointers to null
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
    public int findCeil(TreeNode root, int key) {
        int ceil=-1;
        while(root!=null){
            if(root.val==key){
                ceil=root.val;
                return ceil;
            }
            if(key>root.val){ 
                root=root.right;
            }
            else{
                ceil=root.val;
                root=root.left;
            }
        }
        return ceil;
    }
}

// Class containing the main function
public class Ceil {
    // Function to perform an in-order traversal
    // of a binary tree and print its nodes
    public static void printInOrder(TreeNode root) {
        // Check if the current node
        // is null (base case for recursion)
        if (root == null) {
            // If null, return and
            // terminate the function
            return;
        }

        // Recursively call printInOrder
        // for the left subtree
        printInOrder(root.left);

        // Print the value of the current node
        System.out.print(root.val + " ");

        // Recursively call printInOrder
        // for the right subtree
        printInOrder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);

        System.out.println("Binary Search Tree: ");
        printInOrder(root);
        System.out.println();

        Solution solution = new Solution();

        // Searching for a value in the BST
        int target = 8;
        int ceil = solution.findCeil(root, target);

        if (ceil != -1) {
            System.out.println("Ceiling of " + target + " is: " + ceil);
        } else {
            System.out.println("No ceiling found!");
        }
    }
}
                            
                        