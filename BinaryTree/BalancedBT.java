                                
// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class BalancedBT1{
    public boolean isBalanced(Node root){
        return height(root)!=-1;
    }
    int height(Node root){
        if(root==null)
        return 0;
        int leftHeight=height(root.left);
        if(leftHeight==-1) return -1;
        int rightHeight=height(root.right);
        if(rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1)
        return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}

// Main function
public class BalancedBT{
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
        BalancedBT1 solution = new BalancedBT1();

        // Checking if the tree is balanced
        if (solution.isBalanced(root)) {
            System.out.println("The tree is balanced.");
        } else {
            System.out.println("The tree is not balanced.");
        }
    }
}
                                
                            