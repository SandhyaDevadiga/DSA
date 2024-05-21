                            
import java.util.*;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {
    
    private boolean isSymmetricUtil(Node root1, Node root2) {
       if(root1==null || root2==null){
        return root1==root2;
       }
       if(root1.data!=root2.data) return false;
       return isSymmetricUtil(root1.left, root2.right) && isSymmetricUtil(root1.right, root2.left);

    }

    public boolean isSymmetric(Node root) {
       return root==null|| isSymmetricUtil(root.left, root.right);
    }
}

public class SymmetricBT {
    private static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);

        Solution solution = new Solution();

        System.out.print("Binary Tree (Inorder): ");
        printInorder(root);
        System.out.println();

        boolean res = solution.isSymmetric(root);

        if (res) {
            System.out.println("This Tree is Symmetrical");
        } else {
            System.out.println("This Tree is NOT Symmetrical");
        }
    }
}
                            
                        