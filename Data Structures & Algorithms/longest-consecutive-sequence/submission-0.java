class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        } 
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (hs.contains(cur-1)) {
                continue;
            }  
            int curLen = 1;
            while (true) {
                if (hs.contains(cur+1)) {
                    curLen++;
                    cur++;
                } else {
                    break;
                }
            }
            if (curLen > maxLen) {
                maxLen = curLen;
            }
        
        }
        return maxLen;
    }
}
