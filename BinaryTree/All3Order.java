                            
import java.util.*;
import javafx.util.Pair;

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

public class All3Order {
    public static List<List<Integer>> preInPostTraversal(Node root) {
        // Lists to store traversals
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        
        if(root==null){
            return new ArrayList<>();
        }
        Stack<Pair<Node,Integer>> st=new Stack<>();
        while(!st.empty()){
        Pair<Node, Integer> it = st.pop();
        if(it.getValue==1){
            pre.add(it.getKey().data);
            it.setValue(2);
            st.push(it);
            if(it.getKey().left!=null){
                st.push(new Pair<>(it.getKey().left, 1));
            }
        }
       
       else if(it.getValue==2){
            in.add(it.getKey().data);
            it.setValue(3);
            st.push(it);
            if(it.getKey().right!=null){
                st.push(new Pair<>(it.getKey().left, 1));
            }
        }
       else{
        post.add(it.getKey().data);
       }

        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;
        
    }

   public static void printList(List<Integer> list) {
         for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
       List<Integer> pre, in, post;
        List<List<Integer>> traversals = preInPostTraversal(root);

        // Extracting the traversals
        // from the result
        pre = traversals.get(0);
        in = traversals.get(1);
        post = traversals.get(2);

        // Printing the traversals
        System.out.print("Preorder traversal: ");
        printList(pre);

        System.out.print("Inorder traversal: ");
        printList(in);

        System.out.print("Postorder traversal: ");
        printList(post);
    }
}
                            
                        