class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int maxVolume = Integer.MIN_VALUE;
        while (i < j) {
            int curVolume = (j-i)*Math.min(heights[i],heights[j]);
            if (curVolume > maxVolume) {
                maxVolume = curVolume;
            }
            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxVolume;
    }
}



