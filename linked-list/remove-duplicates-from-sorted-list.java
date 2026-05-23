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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t = head;
        ListNode p = null;
        HashSet<Integer>st = new HashSet<>();
        if(t == null) return null;
        while(t != null){
            if(st.contains(t.val)){
                p.next = t.next;
            }
            else{
                st.add(t.val);
                p = t;
            }
            t = t.next;
        }
        return head;
    }
}