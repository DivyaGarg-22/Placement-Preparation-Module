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
class program4 {
    public TreeNode bstFromPreorder(int[] preorder) {
        // call helper function with initial parameters
        return bstFromPreorder(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    public TreeNode bstFromPreorder(int[] preorder, int bound, int[] i){
        // check if there are no more nodes to add or if current node value exceeds bound
        if(i[0] == preorder.length || preorder[i[0]] > bound){
            return null;
        }

        // create new TreeNode with current node value
        TreeNode root = new TreeNode(preorder[i[0]++]);

        // recursively call helper for left and right subtrees
        // left subtree bound: current node value
        root.left = bstFromPreorder(preorder, root.val, i);
        // right subtree bound: parent node bound
        root.right = bstFromPreorder(preorder, bound, i);

        return root;
    }
}