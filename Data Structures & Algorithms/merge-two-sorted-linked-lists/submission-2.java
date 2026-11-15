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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                ListNode list1dummy = list1.next;
                list1.next = null;
                list1 = list1dummy;
            } else {
                temp.next = list2;
                ListNode list2dummy = list2.next;
                list2.next = null;
                list2 = list2dummy; 
            }
            temp = temp.next;

        }
        while (list1 != null) {
                temp.next = list1;
                ListNode list1dummy = list1.next;
                list1.next = null;
                list1 = list1dummy;
                temp = temp.next;
        }
        while (list2 != null) {
                temp.next = list2;
                ListNode list2dummy = list2.next;
                list2.next = null;
                list2 = list2dummy;
                temp = temp.next;
        }
        return dummy.next;
    }
}