class Solution {
    public int rob(int[] nums) {
        int[]dp = new int[nums.length];
        if (nums.length == 1) {
            return nums[0];
        }
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 0; i < dp.length; i++) {
            
            
            
            if ((i+2) < dp.length && (dp[i]+nums[i+2]) > dp[i+2]) {
                dp[i+2] = (dp[i]+nums[i+2]);
            }
            if ((i+3) < dp.length && (dp[i]+nums[i+3]) > dp[i+3]) {
                
                dp[i+3] = (dp[i]+nums[i+3]);
            }

        }
        return Math.max(dp[dp.length-1], dp[dp.length-2]);
    }
}
