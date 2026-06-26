
class Solution {
    public static int height(TreeNode root){
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null){
            return 1;
        }
        return Math.min(height(root.left),height(root.right))+1;
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return height(root);
    }
}