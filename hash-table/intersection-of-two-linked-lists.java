
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tA = headA;
        ListNode tB = headB;
        int la = 0 , lb = 0;
        while(tA != null){
            tA = tA.next;
            la++;
        }
        while(tB != null){
            tB = tB.next;
            lb++;
        }
        tA = headA;
        tB = headB;
        if(la > lb){
            int steps = la - lb;
            for(int i = 1 ; i <= steps ; i++){
                tA = tA.next;
            }
        }
        else{
            int steps = lb - la;
            for(int i = 1 ; i <= steps ; i++){
                tB = tB.next;
            }
        }
        while(tA != tB){
            tA = tA.next;
            tB = tB.next;
        }
        return tA;
    }
}