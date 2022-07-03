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
        List<ListNode> temp = new ArrayList<>();
        
        ListNode h = head;
        
        while(h != null){
            temp.add(h);
            h = h.next;
        }
        
        int i = 0;
        int j = temp.size()-1;
        ListNode d = new ListNode(-1);
         h = d;
        
        while(i <= j){
            
          h.next = temp.get(i);  
          h = h.next;
          h.next = temp.get(j);
          h = h.next;
            
          i++;
          j--;  
            
        }
        
        h.next = null;
        
        head = d.next;
        
        
        
    }
}