/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null)return head;
          
        Node temp = head;
        
        HashMap<Node, Node> map = new HashMap<>();
        
        while(temp != null){
            Node t = new Node(temp.val);
            
            map.put(temp, t);
            
            temp = temp.next;
            
        }
        
        temp = head;
        while(temp!=null){
            
            Node newNode = map.get(temp);
            newNode.next = (temp.next!=null)?(map.get(temp.next)):null;
            newNode.random = (temp.random!=null)?(map.get(temp.random)):null;
            
            temp = temp.next;
        }
        
        return map.get(head);
        
    }
}