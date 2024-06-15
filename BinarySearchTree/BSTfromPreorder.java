// A binary tree node
class Node {
 
    int data;
    Node left, right;
 
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}
 
class Index {
 
    int index = 0;
}
 
class BSTfromPreorder {
 
    
 
    public Node constructTreeUtil(int[] A, int bound,  int[] i)
    {
        if(i[0]==A.length|| A[i[0]]>bound)
        return null;
        Node root=new Node(A[i[0]++]);
        root.left=constructTreeUtil(A, root.data, i);
        root.right=constructTreeUtil(A, bound, i);
        return root;
    }
 
    Node constructTree(int pre[])
    {
        
        return constructTreeUtil(pre, Integer.MAX_VALUE, new int[]{0});
    }
 
    void printInorder(Node node)
    {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
 
    // Driver code
    public static void main(String[] args)
    {
        BSTfromPreorder tree = new BSTfromPreorder();
        int pre[] = new int[] { 10, 5, 1, 7, 40, 50 };
        int size = pre.length;
        Node root = tree.constructTree(pre);
         
        tree.printInorder(root);
    }
}
 