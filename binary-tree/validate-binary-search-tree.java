
class Solution {
    static boolean flag = true;
    static TreeNode pre = null;
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(pre == null) pre = root;
        else if(pre.val >= root.val) flag = false;
        else{
            pre = root;
        }
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        flag = true;
        pre = null;
        inorder(root);
        return flag;
    }
}