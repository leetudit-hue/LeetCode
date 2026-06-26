
class Solution {
    public static void helper(TreeNode root,int level , List<Integer>a){
        if(root == null) return;
        if(level == 1){
            a.add(root.val);
        }
        helper(root.left,level-1,a);
        helper(root.right,level-1,a);
    }
    public static int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>arr = new ArrayList<>();
        int h = height(root);
        for(int i = h ; i >= 1 ; i--){
            List<Integer>a = new ArrayList<>();
            helper(root,i,a);
            arr.add(a);
        }
        return arr;
    }
}