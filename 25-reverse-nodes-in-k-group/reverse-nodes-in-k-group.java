/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static ListNode reverse(ListNode head , int k){
        int c = 0;
        ListNode temp = head;
        while(c < k){
            if(temp == null) return head;
            temp = temp.next;
            c++;
        }

        ListNode pre = reverse(temp , k);

        temp = head;
        c = 0;
        while(c < k){
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
            c++;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        return reverse(head,k);
    }
}