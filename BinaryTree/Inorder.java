import java.util.ArrayList;
import java.util.List;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data=val;
        left=null;
        right=null;
    }
}
public class Inorder{
    static void InorderTraversal(Node root, List<Integer> arr)
    {
        if(root==null){
            return;
        }
        InorderTraversal(root.left,arr);
        arr.add(root.data);
        InorderTraversal(root.right,arr);
    }
    static List<Integer> InOrderPrint(Node root)
    {
        List<Integer> arr=new ArrayList<>();
        InorderTraversal(root, arr);
        return arr;
    }

public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Getting preorder traversal
        List<Integer> result = InOrderPrint(root);

        // Displaying the preorder traversal result
        System.out.print("Preorder Traversal: ");
        // Output each value in the
        // preorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
}
}