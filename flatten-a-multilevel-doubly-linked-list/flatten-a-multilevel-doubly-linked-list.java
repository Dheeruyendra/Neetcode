/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {
        if (head == null) return head;

        Node dummy = head;

        while (head != null) {
            if (head.child != null) {
                Node headNext = head.next;
                Node headChild = head.child;
                head.next = head.child;
                head.child = null;
                headChild.prev = head;

                while (headChild.next != null) {
                    headChild = headChild.next;
                }

                headChild.next = headNext;

                if (headNext != null) {
                    headNext.prev = headChild;
                }
            }

            head = head.next;
        }

        return dummy;
    }
}
