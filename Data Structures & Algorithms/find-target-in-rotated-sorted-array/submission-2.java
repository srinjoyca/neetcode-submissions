class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l <= r) {
            int m = (l+r)/2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] >= nums[l]) {
                if (nums[l] <= target && target < nums[m]) {
                    r = m;
                } else {
                    l = m+1;
                }
            } else if (nums[m] <nums[r]){
                if (nums[m] < target && target <= nums[r]) {
                    l = m+1;
                } else {
                    r = m;
                }
            }
        }
        return -1;

    }
}
