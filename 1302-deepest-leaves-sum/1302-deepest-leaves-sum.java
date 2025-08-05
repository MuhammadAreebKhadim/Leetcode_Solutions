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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int sum = 0;
        while(!que.isEmpty()){
            sum = 0;
            int n = que.size();
            for(int i = 0; i < n;  i++){
                TreeNode node = que.poll();
                sum += node.val;
                if(node.left != null)  que.offer(node.left);
                if(node.right != null) que.offer(node.right);
            }
        }
        return sum;
    }
}