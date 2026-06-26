
class Solution {
    public static int size(ListNode head){
        if(head == null){
            return 0;
        }
        if(head.next==null) return 1;
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        return n;
    }
    public static TreeNode buildTree(int[]arr,int st,int end){
        if(st > end) return null;
        int mid = st+(end-st)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = buildTree(arr,st,mid-1);
        root.right = buildTree(arr,mid+1,end);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        int n = size(head);
        int[]arr = new int[n];
        ListNode temp = head;
        int idx = 0;
        while(temp!= null){
            arr[idx++] = temp.val;
            temp = temp.next;
        }
        TreeNode root = buildTree(arr,0,n-1);
        return root;
    }
}