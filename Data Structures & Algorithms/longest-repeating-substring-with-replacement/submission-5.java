class Solution {
     public int characterReplacement(String s, int k) {
        int[]arr = new int[26];
        int l = 0;
        int maxCount = 0;
        char maxChar = s.charAt(0);
        
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'A']++;
            if (arr[s.charAt(i)-'A'] > arr[maxChar-'A']) {
                maxChar = s.charAt(i);
            }
            if (i-l+1 > arr[maxChar-'A']+k) {
                arr[s.charAt(l)-'A']--;
                l++;
            } 
            maxCount = Math.max(maxCount, (i-l+1));
        }
        return maxCount;
     }
}

