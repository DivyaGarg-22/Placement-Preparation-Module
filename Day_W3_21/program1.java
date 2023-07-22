public class program1 {

    public  static int findCeil(TreeNode<Integer> node, int x) {
        int ceil = -1;
        while(node!=null){
            if(node.data == x){
                ceil = node.data;
                return ceil;
            }
            else if(node.data > x){
                ceil = node.data;
                node = node.left;
            }
            else if(node.data < x)
            {
                node = node.right;
            }
        }
        
        return ceil;
    }
}