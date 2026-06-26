
class Solution {
    public static void solve(TreeNode root,List<String>ans,String s){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s+=root.val;
            ans.add(s);
        } 
        s+=root.val;
        solve(root.left,ans,s+"->");
        solve(root.right,ans,s+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ans = new ArrayList<>();
        solve(root,ans,"");
        return ans;
    }
}