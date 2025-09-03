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
    int maxsum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        optimal_pathsum(root);
        return maxsum;
    }
    private int optimal_pathsum(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(optimal_pathsum(root.left), 0);
        int right = Math.max(optimal_pathsum(root.right), 0);
        int node_passes = root.val + left + right;
        maxsum = Math.max(maxsum, node_passes); 
        return root.val + Math.max(left, right);
    }
}