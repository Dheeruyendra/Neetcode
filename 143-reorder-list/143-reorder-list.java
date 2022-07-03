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
    
    ListNode reverse(ListNode head){
        
        ListNode pre = null;
      
        
        while(head != null){
            
            ListNode next = head.next;
            
            head.next = pre;
            pre = head;
            head = next;
            
        }
        
        return pre;
        
        
    }
    
    public void reorderList(ListNode head) {
         
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        ListNode rev = reverse(slow.next); 
        slow.next  = null;
        
        ListNode p1 = head;
        ListNode p2 = rev;
        
        while(p1 != null && p2!= null){
            
            ListNode t2 = p2;
            p2 = p2.next;
            
            ListNode t1 = p1.next;
            p1.next = t2;
            t2.next = t1;
            
            p1 = t1;
            
        }
        
    }
}