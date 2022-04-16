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
    private int count = 0;
    public TreeNode convertBST(TreeNode root) {
        convertBSTUtil(root);
        return root;
    }
    
    public void convertBSTUtil(TreeNode root) {
        if(root == null)
            return;
        convertBSTUtil(root.right);
        count += root.val;
        root.val = count;
        convertBSTUtil(root.left);     
    }
}