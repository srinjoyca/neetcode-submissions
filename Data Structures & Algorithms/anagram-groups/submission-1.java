class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> ans = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedKey = new String(ch);
            if (ans.containsKey(sortedKey)) {
                List<String> cur = ans.get(sortedKey);
                cur.add(strs[i]);
            } else {
                List<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                ans.put(sortedKey, arr);
            }
        }

        return new ArrayList<>(ans.values());
    }
       
}
