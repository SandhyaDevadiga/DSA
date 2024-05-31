import java.io.*;
 
public class InsertBT {
 
    // Class containing left
    // and right child of current node
    // and key value
    class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    InsertBT() { root = null; }
 
    InsertBT(int value) { root = new Node(value); }
 
    // This method mainly calls insertRec()
    void insert(int key) { root = insertRec(root, key); }
 
    // A recursive function to
    // insert a new key in BST
    Node insertRec(Node root, int key)
    {
       if(root==null) return new Node(key);
       Node cur=root;
       while(true){
        if(cur.key<=key){
            if(cur.right!=null) 
            cur=cur.right;
            else{
                cur.right=new Node(key);
                break;
            }
        }
        else{
            if(cur.left!=null)
            cur=cur.left;
            else{
                cur.left=new Node(key);
                break;
            }
        }
       }
       return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder() { inorderRec(root); }
 
    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        InsertBT tree = new InsertBT();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        // Print inorder traversal of the BST
        tree.inorder();
    }
} 