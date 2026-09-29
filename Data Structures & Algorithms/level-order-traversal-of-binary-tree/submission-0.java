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
    List<List<Integer>>arr;
    public void traverse(TreeNode root, int index) {
        if (root == null) {
            return; 
        } else {
            if (arr.size()-1 < index ) {
                ArrayList<Integer>temp = new ArrayList<>();
                temp.add(root.val);
                arr.add(temp);
            } else {
                this.arr.get(index).add(root.val);
            }
        }

        if (root.left != null) {
            traverse(root.left, index+1); 
        }
        if (root.right != null) {
            traverse(root.right, index+1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        arr = new ArrayList<>();
        traverse(root, 0);
        return arr;
    }

}
