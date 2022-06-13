class MyLinkedList {

    private static class Node {
        int val;
        Node pre, next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int length;

    public MyLinkedList() {}

    public int get(int index) {
        Node item = getItemByIndex(index);

        if (item != null) return item.val;
        return -1;
    }

    public Node getItemByIndex(int index) {
        if (length > 0 && index < length) {
            if (index == 0) return head;
            if (index == length - 1) return tail;

            Node result;

            if (index > (length / 2)) {
                result = tail;

                for (int i = length - 1; i > index; i--) {
                    result = result.pre;
                }
            } else {
                result = head;

                for (int i = 1; i <= index; i++) {
                    result = result.next;
                }
            }
            return result;
        }

        return null;
    }

    public void addAtHead(int val) {
        if (length > 0) {
            Node newHead = new Node(val);
            newHead.next = head;
            head.pre = newHead;
            head = newHead;
        } else {
            head = new Node(val);
            tail = head;
        }

        length += 1;
    }

    public void addAtTail(int val) {
        if (length > 0) {
            Node newTail = new Node(val);
            tail.next = newTail;
            newTail.pre = tail;

            tail = newTail;
        } else {
            tail = new Node(val);
            head = tail;
        }

        length += 1;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > length) return;
        if (index == 0) addAtHead(val); else if (index == length) addAtTail(val); else {
            Node result = getItemByIndex(index);

            if (result != null) {
                Node newItem = new Node(val);
                newItem.pre = result.pre;
                result.pre.next = newItem;

                newItem.next = result;

                result.pre = newItem;
                length += 1;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) return;

        if (index == 0) {
            if (length == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                 if (length > 2) head.next.pre = head;
            }
            length-=1;
        }else if(index == length-1){
            tail = tail.pre;
            if (length > 2) tail.pre.next = tail;
            length-=1;
        }else{
            Node result = getItemByIndex(index);
            result.pre.next = result.next;
            result.next.pre = result.pre;
            length-=1;
        }
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
