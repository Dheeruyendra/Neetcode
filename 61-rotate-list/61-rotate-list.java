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
    
    int getSize(ListNode head){
        
        int count = 0;
        
        while(head != null){
            count+=1;
            head = head.next;
        }
            return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
          
        if(head == null || k == 0)return head;
        
        int size = getSize(head);
        
        if(k >= size){
        k = k%size;
        }
        if(k == 0)return head;
        
        ListNode dummy = new ListNode(-1, head);
        
        ListNode slow  = dummy;
        ListNode fast  = dummy;
        ListNode last = null;
        
        for(int i=1; i<=k; i++){   
           fast = fast.next;   
        }
        
        while(fast.next != null){    
            slow = slow.next;
            fast = fast.next;
        }
        
         fast.next = head;
        
         head = slow.next;
        slow.next = null;
        return head;
        
    }
}