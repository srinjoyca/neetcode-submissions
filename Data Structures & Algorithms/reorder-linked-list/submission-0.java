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
    public void reorderList(ListNode head) {
        ListNode cur = head;
        while (cur.next!= null) {
            ListNode last = cur;
            while (last.next != null && last.next.next != null) { // hceck the condition
                last = last.next;
            }
            ListNode temp = last;
            last = last.next;
            temp.next = null;
            
            //setting the new order buds
            ListNode nextCur = cur.next;
            cur.next = last;
            last.next = nextCur;


            //moving cur to the next;
            if (cur.next.next != null) {
                cur = cur.next.next;
            } else {cur = cur.next;}
            
        }

    }
}
