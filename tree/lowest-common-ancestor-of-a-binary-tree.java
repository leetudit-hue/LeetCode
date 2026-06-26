// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public static boolean contains(TreeNode root,TreeNode n){
//         if(root == null) return false;
//         if(root == n) return true;
//         return (contains(root.left,n) || contains(root.right,n));
//     }
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == p || root == q) return root;
//         if(p==q) return p;
//         boolean leftp = contains(root.left,p);
//         boolean leftq = contains(root.left,q);
//         if(leftq != leftq) return root;
//         if(leftq) return lowestCommonAncestor(root.left,p,q);
//         return lowestCommonAncestor(root.right,p,q);
//     }
// }
class Solution {
    public static boolean contains(TreeNode root, TreeNode n){
        if(root == null) return false;
        if(root == n) return true;

        return contains(root.left, n) || contains(root.right, n);
    }

    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        if(root == null || root == p || root == q)
            return root;

        boolean pLeft = contains(root.left, p);
        boolean qLeft = contains(root.left, q);

        if(pLeft != qLeft)
            return root;

        if(pLeft)
            return lowestCommonAncestor(root.left, p, q);

        return lowestCommonAncestor(root.right, p, q);
    }
}