class program4 { 
    static int[][] dp=new int[1002][1002];
    static int knapSack(int W, int wt[], int val[], int n) {
        for(int i=0;i<W+1;i++)
            for(int j=0;j<n+1;j++)
                dp[i][j]=-1;
        return knap(W,wt,val,n);
    }
    static int knap(int W, int wt[], int val[], int n){
        if(n==0 || W==0)
            return 0;
        if(dp[W][n]!=-1)
            return dp[W][n];
        if(wt[n-1]>W)
            return dp[W][n]=knap(W,wt,val,n-1);
        else
            return dp[W][n]=Math.max(knap(W,wt,val,n-1),knap(W-wt[n-1],wt,val,n-1)+val[n-1]);
    }
}