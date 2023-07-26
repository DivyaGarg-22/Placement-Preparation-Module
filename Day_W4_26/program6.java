class program6 {
    // ---------- Recursion Solution ---------- 
    static int solve(int i, int j, String str) 
    {
        if (i >= j)
            return 0;

        String original = str.substring(i, j + 1);
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed))
            return 0;

        int split = str.length() - 1;
        for (int k = i; k < j; k++) 
            split = Math.min(split, solve(i, k, str) + solve(k + 1, j, str) + 1);
        
        return split;
    }
    //  ---------- Memorization Solution ---------- 
    static int solve(int i, int j, String str, Integer[][] dp) 
    {
        if (i >= j)
            return 0;

        if(dp[i][j]!=null)
            return dp[i][j];
            
        String original = str.substring(i, j + 1);
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed))
            return dp[i][j] = 0;

        int split = str.length() - 1;
        for (int k = i; k < j; k++) 
            split = Math.min(split, solve(i, k, str, dp) + solve(k + 1, j, str, dp) + 1);
        
        return dp[i][j] = split;
    }
    //  ---------- Tabulation Solution ---------- 
    static int solve(String str, int n)
    {
        int[][] dp = new int[n+1][n+1];
        
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                    continue;
                    
                String original = str.substring(i, j + 1);
                String reversed = new StringBuilder(original).reverse().toString();
                if (original.equals(reversed))
                    continue;
        
                int split = str.length() - 1;
                for (int k = i; k < j; k++) 
                    split = Math.min(split,dp[i][k]+dp[k+1][j]+1);
                
                dp[i][j] = split;
            }
        }
        return dp[0][n-1];
    }
    static int palindromicPartition(String str)
    {
        int n = str.length();
        
        //  ---------- Recursion ---------- 
        // return solve(0,n-1,str);
        
        //  ---------- Memorization ---------- 
        // Integer[][] dp = new Integer[n][n];
        // return solve(0,n-1,str,dp);
        
        //  ---------- Tabulation ---------- 
        // return solve(str,n);
    }
}