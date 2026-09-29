class Solution {
    public int minCostClimbingStairs(int[] cost) {
         int[]dp = new int[cost.length+1];
         for (int i = 0; i < dp.length; i++) {
              dp[i] = Integer.MAX_VALUE;
           }
           dp[0] = 0;dp[1] = 0;
           for (int i = 0; i < dp.length; i++) {
               if ((i < dp.length-1) && (dp[i+1] > dp[i]+cost[i])) {
                  dp[i+1] = dp[i]+cost[i];
              }
              if ((i < dp.length-2) &&(dp[i+2] > dp[i]+cost[i])) {
                  dp[i+2] = dp[i]+cost[i];
              }
           
          }
          
 
          return dp[dp.length-1];
    }
}
