
class Solution {
    public static void morris(List<Integer>arr,TreeNode root){
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left != null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }
                else if(pred.right == curr){
                    pred.right = null;
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                arr.add(curr.val);
                curr = curr.right;
            }
        }
    }

    public static void merge(List<Integer>arr1 ,List<Integer>arr2 ,List<Integer>ans){
        int i = 0;
        int j = 0;
        int n1 = arr1.size();
        int n2 = arr2.size();
        while (i < n1 && j < n2){
            if(arr1.get(i) < arr2.get(j)){
                ans.add(arr1.get(i));
                i++;
            }
            else{
                ans.add(arr2.get(j));
                j++;
            }
        }
        while(i < n1){
            ans.add(arr1.get(i));
            i++;
        }
        while(j < n2){
            ans.add(arr2.get(j));
            j++;
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>arr1 = new ArrayList<>();
        List<Integer>arr2 = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();
        morris(arr1,root1);
        morris(arr2,root2);
        merge(arr1,arr2,ans);
        return ans;
    }
}