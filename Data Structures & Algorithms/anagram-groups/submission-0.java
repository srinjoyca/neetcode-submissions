class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            boolean found = false;
            for (int j = 0; j < ans.size(); j++) {
                
                if (isAnagram(strs[i], ans.get(j).get(0))) {
                    found = true;
                    ans.get(j).add(strs[i]);
                }
            }
            if (!found) {
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                ans.add(arr);
                found = false;
            } 
            
        }
        return ans;
    }
        public boolean isAnagram(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }
            HashMap<Character, Integer> hm = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                hm.put(c, hm.getOrDefault(c, 0)+1);
            }

            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                if (!hm.containsKey(c) || hm.get(c) == 0) {
                    return false;
                }
                hm.put(c, hm.get(c)-1);
            }
            return true;
        }
}
