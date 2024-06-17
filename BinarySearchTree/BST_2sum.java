import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) { 
        this.val = val; 
    }
}

class BST_2sum {
    private Stack<TreeNode> stack;
    // if reverse is true then go to before otherwise next
    boolean reverse;

    public BST_2sum(TreeNode root, boolean isReverse) {
        stack = new Stack<>();
        reverse = isReverse;
        pushAllLeft(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public int next() {
        TreeNode node = stack.pop();
        if (reverse == false) {
            pushAllLeft(node.right);
        } else {
            pushAllLeft(node.left);
        }
        return node.val;
    }

    private void pushAllLeft(TreeNode node) {
        while (node != null) {
            stack.push(node);
            if (reverse == false) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    public static int[] TwoSum(TreeNode root, int k) {
        if (root == null) {
            return new int[0];
        }
        BST_2sum l = new BST_2sum(root, false);
        BST_2sum r = new BST_2sum(root, true);
        int i = l.next();
        int j = r.next(); // since r is pointed from before so it automatically from before
        while (i < j) {
            if (i + j == k) {
                return new int[]{i,j};
            } else if (i + j < k) {
                i = l.next();
            } else {
                j = r.next();
            }
        }
        return new int[0];
    }

    // Drivers code
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        int target = 18;
       int[] result = TwoSum(root, target);
        if (result.length == 2) {
            System.out.println("Elements found: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No elements found with sum equal to " + target);
        }
        // Creating BST_2sum for in-order and reverse in-order traversal
        BST_2sum iterator = new BST_2sum(root, false); // In-order traversal
        System.out.println("In-order traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
