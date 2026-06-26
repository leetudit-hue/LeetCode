
class Solution {
    public static TreeNode invert(TreeNode root){
        if(root == null) return root;
        TreeNode temp = root.left;
        root.left = invert(root.right);
        root.right = invert(temp);
        return root;
    }
    public static boolean isSameTree(TreeNode p , TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
    public boolean isSymmetric(TreeNode root) {
        TreeNode temp = invert(root.left);
        return isSameTree(temp,root.right);
    }
}