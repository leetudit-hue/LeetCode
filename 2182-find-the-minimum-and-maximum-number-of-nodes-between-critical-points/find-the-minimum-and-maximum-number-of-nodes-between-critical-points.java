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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;
        int min = Integer.MAX_VALUE;
        int firstCp = -1;
        int lastCp = -1;
        int[]ans = new int[2];
        while(curr.next != null){
            if(curr.val > prev.val && curr.val > curr.next.val){
                if(firstCp == -1){
                    firstCp = i;
                }
                if(lastCp != -1){
                    min = Math.min(min , i - lastCp);   
                }
                lastCp = i;
            }
            else if(curr.val < prev.val && curr.val < curr.next.val){
                if(firstCp == -1){
                    firstCp = i;
                }
                if(lastCp != -1){
                    min = Math.min(min , i - lastCp);   
                }
                lastCp = i;
            }
            i++;
            prev = curr;
            curr = curr.next;
        }
        int max = lastCp - firstCp;
        if(min == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        ans[0] = min;
        ans[1] = max;
        return ans;
    }
}