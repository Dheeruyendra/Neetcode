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
          ListNode slow = head;
          ListNode fast = head;
      
        
           while(fast != null && fast.next != null){
                  while(n != 0 && fast.next!=null){
                      fast = fast.next;
                      n-=1;
                  }
               if(fast == null || fast.next == null )break;
               
               fast = fast.next;
               slow = slow.next;
               
           }
        
           if(n >0){
               return head = head.next;
           }
        
          slow.next = slow.next.next;
          return head;
    }
}