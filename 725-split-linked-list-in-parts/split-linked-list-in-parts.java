
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]arr = new ListNode[k];
        int l = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            l++;
        }
        if(l == 0) return arr;
        int each = l / k;
        int rem = l % k;
        ListNode curr = head;
        ListNode prev = null;
        for(int i = 0 ; i < k ; i++){
            arr[i] = curr;
            for(int c = 1 ; c <= each ; c++){
                prev = curr;
                curr = curr.next;
            }
            if(rem > 0){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            rem--;
        }
        return arr;
    }
}