
class Solution {
    public static TreeNode build(int[] preorder, int[] inorder , int prel , int preh , int inl , int inh){
        if(prel > preh || inl > inh) return null;
        TreeNode root = new TreeNode(preorder[prel]);
        int i = inl;
        while(i < inorder.length && inorder[i]!=preorder[prel]){
            i++;
        }
        int l = i - inl;
        root.left = build(preorder,inorder,prel+1,prel+l,inl,i-1);
        root.right = build(preorder,inorder,prel+l+1,preh,i+1,inh);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return build(preorder,inorder,0,n-1,0,n-1);
    }
}