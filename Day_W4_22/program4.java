class program4
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<adj.size(); i++){
            if(!vis[i]){
                //call our util function
                topoSortUtil(adj, vis, stack, i);
            }
        }
        
        int arr[] = new int[V];
        for(int i=0; i<V; i++){
            arr[i] = stack.pop();
        }
        
        return arr;
    }
    
    public static void topoSortUtil(ArrayList<ArrayList<Integer>> adj, boolean vis[], 
    Stack<Integer>stack, int curr){
        
        //perform normal dfs
        
        vis[curr] = true;
        
        for(int neighbor : adj.get(curr)){
            if(!vis[neighbor]){
                topoSortUtil(adj,vis,stack,neighbor);
            }
        }
        
        //after performing dfs for all neighbors add them in stack 
        stack.push(curr);
    }
}