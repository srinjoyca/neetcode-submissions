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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode future = head;

        for (int i = 0; i < n; i++) {
            
            future = future.next;
            
        }
        
        
        while (future != null) {
            prev = prev.next;
            future = future.next;
        }
        
        prev.next = prev.next.next;

        
        return dummy.next;
        
    }
}
