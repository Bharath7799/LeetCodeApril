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
    private TreeNode top;
    public TreeNode increasingBST(TreeNode root) {
        top = new TreeNode(0);
        TreeNode ans = top;
        increasingBSTUtil(root);
        return ans.right;
    }
    
    public void increasingBSTUtil(TreeNode root) {
        if(root == null) return;
        increasingBSTUtil(root.left);
        top.right = new TreeNode(root.val);
        top = top.right;
        increasingBSTUtil(root.right);
    }
}