class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char[]ch = s.toCharArray();
        int maxLength = 0;
        int maxCount = 0;
        int l = 0;
        for (int r = 0; r < ch.length; r++) {
            //put the current count of cur character
            hm.put(ch[r], hm.getOrDefault(ch[r], 0) + 1);
            maxCount = Math.max(maxCount, hm.get(ch[r]));
            //you only try to do this when maxCount aka max letter can't cover the window with k, so like this window is furiated, so we move the window left, 
            while ((r - l + 1) - maxCount > k) {
                //shrink the window
                hm.put(ch[l], hm.get(ch[l])-1);
                l++;
            }
            maxLength = Math.max(maxLength, r-l+1);
        }
        return maxLength;
    } 
}
