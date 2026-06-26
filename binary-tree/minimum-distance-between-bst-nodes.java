
class Solution {
    static TreeNode prev = null;
    static int min = Integer.MAX_VALUE;
    public static void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(prev == null) prev = root;
        else{
            min = Math.min(min,root.val-prev.val);
            prev = root;
        }
        helper(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        prev = null;
        min = Integer.MAX_VALUE;
        helper(root);
        return min;
    }
}