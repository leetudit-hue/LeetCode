
class Solution {
    public static void nthlev1(TreeNode root,int lev ,List<Integer>arr){
        if(root == null) return;
        if(lev == 1){
            arr.add(root.val);
            return;
        }
        nthlev1(root.left,lev-1,arr);
        nthlev1(root.right,lev-1,arr);
    }
    public static void nthlev2(TreeNode root,int lev,List<Integer>arr){
        if(root == null) return;
        if(lev == 1){
            arr.add(root.val);
            return;
        }
        nthlev2(root.right,lev-1,arr);
        nthlev2(root.left,lev-1,arr);
    }
    public static int height(TreeNode root){
        if(root == null) return 0;
        int a = height(root.left);
        int b = height(root.right);
        return Math.max(a,b)+1;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int level = height(root);
        if(level == 0) return new ArrayList<>();
        for(int i = 1 ; i <= level ; i++){
            List<Integer>arr = new ArrayList<>();
            if(i % 2 == 0){
                nthlev2(root,i,arr);
            }
            else{
                nthlev1(root,i,arr);
            }
            ans.add(arr);
        }
        return ans;
    }
}