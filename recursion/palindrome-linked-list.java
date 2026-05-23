
class Solution {

    public ListNode reverse(ListNode n){
        ListNode current = n;
        ListNode pre = null;
        ListNode nex = null;
        while(current != null){
            nex = current.next;
            current.next = pre;
            pre = current;
            current = nex;
        }
        return pre;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while(p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}