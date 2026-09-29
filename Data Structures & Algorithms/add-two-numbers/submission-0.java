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
        int a = 0; 
        int b = 0; 
        int i = 1;
        int j = 1;
        
        while (l1 != null) {
            a += i*l1.val;
            i*=10;
            l1 = l1.next;
        }
        while (l2 != null) {
            b += j*l2.val;
            j*=10;

            l2 = l2.next;
        }
        
        int c = a+b;
        String s = ""+c;
        ListNode head = new ListNode();
        head.val = 0; 
        ListNode temp = head;
        for (i = s.length()-1; i >= 0; i--) {
            String x = s.substring(i, i+1);
            int put = Integer.parseInt(x);
            ListNode nextNode = new ListNode();
            nextNode.val = put;
            head.next = nextNode;
            head = head.next;
        }
        return temp.next;
    }
}
