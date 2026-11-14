class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s1Map.put(c, s1Map.getOrDefault(c, 0)+1);
        }

        HashMap<Character, Integer> windowMap = new HashMap<>();
        int windowSize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            char rightChar = s2.charAt(i);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0)+1);
            if (i >= windowSize) {
                //this is left char if the i becomes the window size 
                    char leftChar = s2.charAt(i-windowSize);
                    if (windowMap.get(leftChar)  == 1) {
                        windowMap.remove(leftChar);
                    } else {
                        windowMap.put(leftChar, windowMap.get(leftChar)-1);
                    }
            }
            if (i >= windowSize-1) {
                if (windowMap.equals(s1Map)) {
                    return true;
                }
            }
        }    
        return false;
        
    }
}
