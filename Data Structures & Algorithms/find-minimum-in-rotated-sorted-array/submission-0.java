class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if ((i+1 < nums.length) && nums[i] > nums[i+1] ) {
                return nums[i+1];
            }

        }
        return min;
    }
}
