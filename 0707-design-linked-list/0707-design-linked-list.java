class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    Node head;
    
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        Node current = head;
        int count = 0;
        while (current != null) { 
            if (count == index) {
                return current.val;
            }
            current = current.next;
            count++; 
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return; 
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode; 
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;         
        }
        
        if (current != null) {
            Node newNode = new Node(val);
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (head == null || index < 0) return;
        if (index == 0) { 
            
            head = head.next;
            return;
        }
        Node current = head;
        int i = 0; 
        while (current.next != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}
