class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {        
        List<List<Integer>>subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        generateSubsets(nums, 0, subset, subsets);
        return subsets;
    }
    public void generateSubsets(int[]nums, int position, List<Integer>subset, List<List<Integer>>subsets) {
        if (position == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[position]);
        generateSubsets(nums, position+1, subset, subsets);

        subset.remove(subset.size()-1);
        generateSubsets(nums, position+1, subset, subsets);

    }
}
