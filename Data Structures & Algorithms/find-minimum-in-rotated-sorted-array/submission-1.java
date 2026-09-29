class Solution {
    // public int findMin(int[] nums) {
    //     // int min = Integer.MAX_VALUE;
    //     // for (int i = 0; i < nums.length; i++) {
    //     //     if (nums[i] < min) {
    //     //         min = nums[i];
    //     //     }
    //     //     if ((i+1 < nums.length) && nums[i] > nums[i+1] ) {
    //     //         return nums[i+1];
    //     //     }
    //         int left = 0;
    //         int right = nums.length-1;
    //         if (nums[left] < nums[right]) {
    //             return nums[left];
    //         }
    //         while (left <= right) {
    //             int middle = (left+right)/2
    //             if (nums[middle] > nums[middle+1]) {
    //                 return nums[middle+1];
    //             }
    //             if (nums[middle] > left) {
    //                 left = middle+1;
    //             } else if (nums[middle] > right ) {
    //                 left = middle+1;
    //             } else  if (nums[middle] < left){
    //                 right = middle-1;
    //             } else if (nums[middle] < right) {

    //             }
    //         }

            
    //     }
    //     return 1;

    //     // return min;
    // }

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }

            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }


}
