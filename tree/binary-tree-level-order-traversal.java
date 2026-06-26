
class Solution {
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void nthLev(List<Integer>arr,int lev,TreeNode root){
        if(root == null) return;
        if(lev == 1){
            arr.add(root.val);
            return;
        }
        nthLev(arr,lev-1,root.left);
        nthLev(arr,lev-1,root.right);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        int level = height(root);
        if(level == 0) return ans;
        for(int i = 1 ; i <= level ; i++){
            List<Integer>arr = new ArrayList<>();
            nthLev(arr,i,root);
            ans.add(arr);
        }
        return ans;
    }
}