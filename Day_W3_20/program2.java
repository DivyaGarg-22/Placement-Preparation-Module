class program2 {
    public TreeNode searchBST(TreeNode root, int val) {
        // If the root is null or its value is equal to the target value, return the root
        if (root == null || root.val == val) {
            return root;
        }
        
        // If the target value is less than the root's value, search in the left subtree
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            // If the target value is greater than the root's value, search in the right subtree
            return searchBST(root.right, val);
        }
    }
}