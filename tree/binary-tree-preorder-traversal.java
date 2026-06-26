
class Solution {
    public static void helper(List<Integer>arr,TreeNode root){
        if(root == null) return;
        arr.add(root.val);
        helper(arr,root.left);
        helper(arr,root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<Integer>();
        helper(ans,root);
        return ans;
    }
}