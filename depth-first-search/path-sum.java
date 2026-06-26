
class Solution {
    public boolean hasPathSum(TreeNode root, int targetsum) {
        if(root == null){
            return false;
        }
        if(root != null && (root.left == null && root.right == null)){
            targetsum -= root.val;
            if(targetsum == 0) return true;
        }
        targetsum -= root.val;
        return (hasPathSum(root.left,targetsum)||hasPathSum(root.right,targetsum));
    }
}