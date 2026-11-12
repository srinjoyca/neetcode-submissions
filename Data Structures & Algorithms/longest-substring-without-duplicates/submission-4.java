class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() <1) return 0; 
        if (s.length() == 1) return 1;
        char ch[] = s.toCharArray();
        int maxLength = 0;
        int tempLength = 0;
        HashMap<Character, Integer> tracker = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (tracker.containsKey(ch[i])) {
                maxLength = Math.max(tempLength, maxLength);
                i = tracker.get(ch[i]);
                tracker.clear();
                tempLength = 0;
            } else{
                tracker.put(ch[i], i);
                tempLength++;
            } 
        }
        return Math.max(maxLength, tempLength);
    }
}
