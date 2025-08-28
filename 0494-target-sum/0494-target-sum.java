class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int num : nums) sum += num;
        if((target + sum) % 2 != 0 || Math.abs(target) > sum) return 0;
        int target_sum = (target + sum) / 2;
        int[] dp = new int[target_sum + 1];
        dp[0] = 1;
        for(int num : nums){
            for(int j = target_sum; j >= num; j--){
                dp[j] = dp[j] + dp[j - num];
            }
        } 
        return dp[target_sum];
    }
}