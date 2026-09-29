class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>>ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer>cur = new ArrayList<>();
            cur.add(nums[i]);    
            backTrack(i, nums[i], target, nums, cur, ans);
        }
        
        return ans;

    }
    public void backTrack(int i, int curSum, int target, int nums[], List<Integer>cur, List<List<Integer>>ans) {
        if (curSum == target) {
            List<Integer> copy = new ArrayList<>(cur);
            ans.add(copy);
        } else if (curSum > target || i >= nums.length) return;
        else {
            cur.add(nums[i]);
            backTrack(i, curSum + nums[i], target, nums, cur, ans);
            cur.remove(cur.size()-1);
            backTrack(i + 1, curSum, target, nums, cur, ans);
        }
    }
}

















