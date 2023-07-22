/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class program5 {

    List<Integer> l;
    int len;
    int curr;

    public BSTIterator(TreeNode root) {
        BST1 B = new BST1();
        B.inOrder(root);
        this.l = B.l;
        len = this.l.size();
        this.curr = 0;

    }

    public int next() {
        int data = -1;
        if (curr < len) {
            data = l.get(curr);
            curr++;
        }

        return data;

    }

    public boolean hasNext() {
        return curr < len;

    }
}

class BST1 {

    List<Integer> l = new ArrayList<>();

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        l.add(root.val);
        inOrder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */