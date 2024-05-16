import java.util.LinkedList;
import java.util.Queue;

// Node class for the binary tree
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

class Solution {
   int maxDepth(Node root){
    if(root==null){
        return 0;
    }
    Queue<Node> q=new LinkedList<>();
    int level=0;
    q.add(root);
    while(!q.isEmpty()){
        int size=q.size();
        for(int i=0; i<size; i++){
            Node front=q.poll();
            if(front.left!=null){
                q.add(front.left);
            }
             if(front.right!=null){
                q.add(front.right);
            }
            
        }
        level++;
    }
    return level;
   }
}

// Main class
public class MaximumDepth{
    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);

        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}
   