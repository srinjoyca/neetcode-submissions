class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]left = new int[nums.length];
        int[]right = new int[nums.length];
        int l = 1;
        int r = 1;
        right[nums.length-1] = 1;
        for (int i = 0; i < nums.length; i++) {
            l = l*nums[i];
            r = r*nums[nums.length-1-i];
            left[i] = l;
            right[nums.length-1-i] = r;
        }
        int[]ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            if (i == 0) { 
                ans[i] = right[i+1];
            } else if (i == nums.length-1) {
                ans[i] = left[i-1];
            } else {
                ans[i] = left[i-1]*right[i+1];
            }
        }
        return ans;
    }

  
}  
