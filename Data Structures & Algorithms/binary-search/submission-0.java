class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return -1;
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public int binarySearch(int[]nums, int left, int right, int target) {
        if (left > right) return -1;
        int middle = left+(right-left)/2;
        if (nums[middle] == target) {
            return middle;
        }
        if (nums[middle] > target) {
            return binarySearch(nums, left, middle-1, target);
        }else  {
            return binarySearch(nums, middle+1, right, target);
        }

    }
}
