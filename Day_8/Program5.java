

class Program5{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	      int[] dp = new int[V+1];
	    dp[0] = 0;
	    
	    for(int i=1;i<=V;i++) {
	        dp[i] = Integer.MAX_VALUE;
	        
	        for(int j=0;j<M;j++) {
	            if(coins[j] <= i && dp[i-coins[j]] != Integer.MAX_VALUE) {
	                dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
	            }
	        }
	    }
	    
	    return dp[V] == Integer.MAX_VALUE ? -1 : dp[V];
	} 
}