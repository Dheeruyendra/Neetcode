class MyLinkedList {
    
    class Node{
        
        int val;
        Node next;
        
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
        
    }
    
    Node head;
    int length;
       

    public MyLinkedList() {
        length =0;
         head = null;
    }
    
    int helperGet(Node head, int index){
        if(index == 0)return head.val;
        
        return helperGet(head.next, index-1);
    }
    
    public int get(int index) {
        if(index >= length)return -1;
        
        return helperGet( head,  index);
        
    }
    
    
    public void addAtHead(int val) {
            Node newHead = new Node(val, head);
            head = newHead;
            length+=1;
    }
    
    public void addAtTail(int val) {
         if(head == null){
             head = new Node(val, null);
             length+=1;
             return;
         }
        
         Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        Node newTail = new Node(val, null);
        temp.next = newTail;
        length+=1;
        
    }
    
    public void addAtIndex(int index, int val) {
          if(index > length)return; 
        
           if(index == 0){
               
               Node temp = new Node(val, head);
                  head = temp;
                  length+=1;
                  return;
           }
        
            Node pre = head;
            int count = 0;
        
            while( count != index-1){
               pre = pre.next;
               count+=1; 
            }
        
             Node temp = new Node(val, pre.next);
              pre.next = temp;
             length+=1;
        
    }
    
    public void deleteAtIndex(int index) {
        
        if(index >= length)return;
          
        if(index == 0){
            head = head.next;
            length-=1;
            return;
        }
        
        int count = 0;
        
        Node temp = head;
        
        while(count != index-1){
            temp = temp.next;
            count+=1;
        }
        
        temp.next = temp.next.next;
        length-=1;
        
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */