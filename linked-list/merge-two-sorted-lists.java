
class Solution {
    public static ListNode sort(ListNode h1 , ListNode h2){
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        if(h1.val<=h2.val){
            h1.next = sort(h1.next,h2);
            return h1;
        }
        else{
            h2.next = sort(h1,h2.next);
            return h2;
        }
    }
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode head = sort(h1,h2);
        return head;
    }
}