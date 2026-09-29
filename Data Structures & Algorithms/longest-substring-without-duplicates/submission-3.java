class Solution {   
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int maxNum = 1;
        int tempNum = 0;

        HashMap<Character, int[]> hm = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            if (hm.get(s.charAt(i)) == null) {
                int[]temp = {1,i};
                hm.put(s.charAt(i), temp);
                tempNum++;
            } else {

                if (tempNum > maxNum) {
                    maxNum = tempNum;
                }
                tempNum = 0;
                int[]temp = hm.get(s.charAt(i));
                i = temp[1];
                hm = new HashMap<>();
            }
            i++;
            if (i == s.length() && maxNum < tempNum) {
                maxNum = tempNum;
            }
        }
        return maxNum;
    }
}

