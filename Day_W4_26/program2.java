


class program2 {
    public int coinChange(int[] coins, int amount) {
        int [] dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            int min= Integer.MAX_VALUE; // we can think it as INFINITY
            for(int j=0;j<coins.length;j++){
                if(i>=coins[j] && dp[i-coins[j]]!= -1){
                    min=Math.min(min,dp[i-coins[j]]);
                }
            }
            dp[i]= (min==Integer.MAX_VALUE)? -1:min+1;
        }
        return dp[amount];
    }
}//TC:O(n*amount), SC:O(amount)
