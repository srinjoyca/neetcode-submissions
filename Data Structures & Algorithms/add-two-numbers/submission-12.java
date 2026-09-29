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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode finalAnswer = new ListNode(0);
        ListNode dummy = finalAnswer;
        while (l1 != null && l2 != null) {
            int value = l1.val+l2.val;
            l1 = l1.next;
            l2 = l2.next;

            int carry = value / 10;
            int curValue = value % 10;
            dummy.val = dummy.val + curValue;
            if (l1 == null && l2 == null && carry == 0) return finalAnswer;
//            if (!(carry == 0 && (l1.next == null || l2.next == null))) {
//
//            }
            dummy.next = new ListNode(carry);
            dummy = dummy.next;




        }

        if (l1 != null) {

            while (l1 != null) {

                int value = l1.val + dummy.val;
                int carry = value/10;
                int current = value % 10;
                dummy.val = current;
                if (l1.next == null && carry == 0) {
                } else {
                    dummy.next = new ListNode(carry);
                    dummy = dummy.next;
                }

                l1 = l1.next;
            }
        }
        if (l2 != null) {
            while (l2 != null) {
                int value = l2.val + dummy.val;
                int carry = value/10;
                int current = value % 10;
                dummy.val = current;
                if (l2.next == null && carry == 0) {
                } else {
                    dummy.next = new ListNode(carry);
                    dummy = dummy.next;
                }

                l2 = l2.next;
            }
        }


        return finalAnswer;
    }

}
