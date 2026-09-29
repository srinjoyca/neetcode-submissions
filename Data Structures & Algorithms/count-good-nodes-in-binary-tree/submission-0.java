/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int numGood = 0;
    
    public  void update(TreeNode root, int maxValue) {
        if (root == null) return;
        if (root.val >= maxValue) {
            this.numGood++;
            maxValue = root.val;
        }
        update(root.right, maxValue);
        update(root.left, maxValue);
    }
    public int goodNodes(TreeNode root) {
        update(root, Integer.MIN_VALUE);
        return numGood;
    }
}
