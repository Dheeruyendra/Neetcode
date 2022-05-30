/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    
    int getSize(ListNode head){
        if (head == null) return 0;
        
        return 1+getSize(head.next);
        
    }
    
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null) return null;
      //  if(headA.next == headB) return headB;
        
       int size1 = getSize(headA);
       int size2 = getSize(headB);
        
        ListNode h1 = headA;
        ListNode h2 = headB;
        
       while(h1!=null && h2!=null){
           
           if(h1==h2){
               return h1;
           }
           
           if(size1>size2){
               
               h1 = h1.next;
               size1--;
           }   
           else if(size2 > size1){
               
               h2 = h2.next;
               size2--;   
           } 
           else{
               h1 = h1.next;
               h2 = h2.next;
           }
           
       } 
        return null;
    }
}