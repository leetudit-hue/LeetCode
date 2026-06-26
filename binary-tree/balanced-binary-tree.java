
class Solution {
    public static int height(TreeNode root){
        if(root == null) return 0;
            int a = height(root.left);
            int b = height(root.right);
            return Math.max(a,b)+1;
        }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int l = height(root.left);
        int r = height(root.right);
        int d = l - r;
        if(d < 0) d = -d;
        if(d > 1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
}