import java.util.Stack;
 
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
 
    TreeNode(int val) { this.val = val; }
}
 
class BSTiterator {
    private Stack<TreeNode> stack;
 
    public BSTiterator(TreeNode root)
    {
        stack = new Stack<>();
        pushAllLeft(root);
    }
 
    public boolean hasNext() {
         return !stack.isEmpty(); 
         }
 
    public int next()
    {
        TreeNode node = stack.pop();
        if (node.right != null) {
            pushAllLeft(node.right);
        }
        return node.val;
    }
 
    private void pushAllLeft(TreeNode node)
    {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }
 
    // Drivers code
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
 
        BSTiterator iterator = new BSTiterator(root);
 
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


