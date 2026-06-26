
class Solution {
    public static void helper(List<List<Integer>>ans,List<Integer>arr,TreeNode root,int sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            arr.add(root.val);
            if(sum == root.val){
                List<Integer>temp = new ArrayList<>();
                for(int num : arr){
                    temp.add(num);
                }
                ans.add(temp);
            }
            arr.removeLast();
            return;
        }
        arr.add(root.val);
        sum-=root.val;
        helper(ans,arr,root.left,sum);
        helper(ans,arr,root.right,sum);
        arr.removeLast();
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>arr = new ArrayList<>();
        helper(ans,arr,root,targetSum);
        return ans;
    }
}