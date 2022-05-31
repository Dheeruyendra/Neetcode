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

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);

        while (dummy.next != null && dummy.next.val == val) {
            dummy.next = dummy.next.next;
        }
        head = dummy.next;

        while (head != null && head.next != null) {
            
            if (head.next.val == val) {
                ListNode temp = head.next;

                while (temp != null && temp.val == val) {
                    temp = temp.next;
                }
                head.next = temp;
            }
               if(head == null) break;
            head = head.next;
        }

        return dummy.next;
    }
}
