class Node {
    int key;
    Node left, right;

    Node(int item) {
        key = item;
        left = right = null;
    }
}

class  DeleteNode {
    Node root;

     DeleteNode() {
        root = null;
    }

    // A utility function to insert a new node with the given key
    Node insert(Node node, int key) {
        // If the tree is empty, return a new node
        if (node == null) {
            return new Node(key);
        }

        // Otherwise, recur down the tree
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        }

        // return the (unchanged) node pointer
        return node;
    }

    // A utility function to do inorder traversal of BST
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Given a binary search tree and a key, this function deletes the key and returns the new root
    Node deleteNode(Node root, int target) {
      if(root==null){
        return null;
      }
      if(root.key==target){
        return helper(root);
      }
      Node dummy=root;
      while(root!=null){
        if(root.key>target){
            if(root.left!=null && root.left.key==target){
              root.left=helper(root.left);
              break;
            }
            else{
                root=root.left;
            }
        }
        else{
            if(root.right!=null &&  root.right.key==target){
              root.right=helper(root.right);
              break;
            }
            else{
                root=root.right;
            }
            }
        }
        
      
      return dummy;
    }
    Node helper(Node root){
       if(root.left==null){
        return root.right;
       }
       else if(root.right==null){
        return root.left;
       }
       Node rightchild=root.right;
       Node lastright=findLastRight(root.left);
       lastright.right=root.right;
       return root.left;
    }
    Node findLastRight(Node root){
     if(root.right==null){
        return root;
     }
     return findLastRight(root.right);
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    // Driver Code
    public static void main(String[] args) {
        DeleteNode tree = new  DeleteNode();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Original BST: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("\nDelete a Leaf Node: 20");
        tree.root = tree.deleteNode(tree.root, 20);
        System.out.print("Modified BST tree after deleting Leaf Node:\n");
        tree.inorder(tree.root);
        System.out.println();

       System.out.println("\nDelete Node with both child: 50");
        tree.root = tree.deleteNode(tree.root, 50);
        System.out.print("Modified BST tree after deleting both child Node:\n");
        tree.inorder(tree.root);
    }
}