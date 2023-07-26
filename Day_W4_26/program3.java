class program3 {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 == 1) return false;
        return partition(nums.length, 0, sum, nums, new int[nums.length + 1][sum + 1]);
    }
    private boolean partition(int n, int sum1, int sum2, int[] nums, int[][] memo) {
        if(n == 0 || sum1 == sum2 || sum2 < 0) {
            memo[n][sum1] = sum2 < 0 || sum1 == sum2 ? 1 : 2;
            return sum2 < 0 ? false : sum1 == sum2;
        }
        if(memo[n][sum1] == 0) {  
            boolean isPartition = partition(n-1, sum1 + nums[n-1], sum2 - nums[n-1], nums, memo) || 
                partition(n-1, sum1, sum2, nums, memo);
            memo[n][sum1] = isPartition == true ? 2 : 1;
        }
        return memo[n][sum1] == 2;
    }
}