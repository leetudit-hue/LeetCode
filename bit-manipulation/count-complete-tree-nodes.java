
class Solution {
    public static int helper(TreeNode root){
        if(root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        return 1 + l + r;
    }
    public int countNodes(TreeNode root) {
        int n = helper(root);
        return n;
    }
}