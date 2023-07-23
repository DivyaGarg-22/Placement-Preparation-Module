class program2 {
    void dfs(int src,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> ans)
    {
        visited[src]=true;
        ans.add(src);
        for(int x: adj.get(src))
        {
            if(!visited[x])
                dfs(x,adj,visited,ans);
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]=new boolean [V];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                dfs(i,adj,visited,ans);
            }
        }
        return ans;
    }
}