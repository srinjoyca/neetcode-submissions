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
    public static boolean isValid(TreeNode root, int left, int right) {
        if (root == null) return true;
        if (root.val <= left || root.val >= right) return false;
        if (root.left == null) {
            if (root.right != null && root.right.val <= root.val) {
                return false;
            }
        }
        if (root.right == null) {
            if (root.left != null && root.left.val >= root.val) {
                return false;
            }
        }
        if (root.left != null && root.right != null) {
            if (root.left.val >= root.val || root.right.val <=root.val) {
                return false;
            }
        }
        boolean x =  isValid(root.right, root.val, right);

        boolean y = isValid(root.left, left, root.val);
        return x && y;
    }

    public static boolean isValidBST(TreeNode root) {

        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
