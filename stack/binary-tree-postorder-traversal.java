
class Solution {
    public static void helper(TreeNode root,List<Integer>arr){
        if(root == null) return;
        helper(root.left,arr);
        helper(root.right,arr);
        arr.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>arr = new ArrayList<>();
        helper(root,arr);
        return arr;
    }
}