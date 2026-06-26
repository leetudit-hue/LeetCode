
class Solution {
    public static void delete(TreeNode root,int target){
        if(root == null) return;
        if(root.val > target){
            if(root.left == null) return;
            if(root.left.val == target){
                if(root.left.left == null && root.left.right == null){
                    root.left = null;
                }
                else if(root.left.left == null || root.left.right == null){
                    if(root.left.left!=null){
                        root.left = root.left.left;
                    }
                    else{
                        root.left = root.left.right;
                    }
                }
                else{
                    TreeNode curr = root.left;
                    TreeNode pred = curr.left;
                    while(pred.right != null){
                        pred = pred.right;
                    }
                    delete(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else {
                delete(root.left,target);
            }
        }
        else{
            if(root.right == null) return;
            if(root.right.val == target){
                if(root.right.left == null && root.right.right == null){
                    root.right = null;
                }
                else if(root.right.left == null || root.right.right == null){
                    if(root.right.left != null){
                        root.right = root.right.left;
                    }
                    else{
                        root.right = root.right.right;
                    }
                }
                else{
                    TreeNode curr = root.right;
                    TreeNode pred = curr.left;
                    while(pred.right != null){
                        pred = pred.right;
                    }
                    delete(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else{
                delete(root.right,target);
            }
        }
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp = new TreeNode(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp,key);
        return temp.left;
    }
}