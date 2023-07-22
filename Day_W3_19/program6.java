class program6 {
    Node solve(Node node)
    {
        if(node==null)return null;
        Node rightSubtree=solve(node.right);
        Node leftSubtree=solve(node.left);
        node.left=rightSubtree;
        node.right=leftSubtree;
        return node;
    }
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
       solve(node);
    }
}