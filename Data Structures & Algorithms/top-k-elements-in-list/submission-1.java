class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            counts.put(cur, counts.getOrDefault(cur, 0)+1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        for (int i : counts.keySet()) {
            int freq = counts.get(i);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            } 
            buckets[freq].add(i);
            
        }
        int index = 0;
        int[]ans = new int[k];
        for (int i = buckets.length-1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int j : buckets[i]) {
                    if (index < k) {
                        ans[index] = j;
                        index++;
                    } else break;
                }    
            }
        }
        return ans;
    }
}
