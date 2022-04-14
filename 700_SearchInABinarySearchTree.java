class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return root;
        if(root.val == val) return root;
        else return (root.val > val) ? searchBST(root.left,val) : searchBST(root.right,val);
    }
}