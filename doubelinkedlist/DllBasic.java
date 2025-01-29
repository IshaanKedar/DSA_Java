package doubelinkedlist;

public class DllBasic {
    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;  // Store the last node globally for reverse traversal

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        } else {
            tail = node; // If the list was empty, tail should also point to this node
        }
        head = node;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void display() {
        Node node = head;
        System.out.print("Forward: ");
        while (node != null) {
            System.out.print(node.val + " -> ");
            tail = node; // Update tail to the last node
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void displayRev() {
        Node node = tail;  // Start from the last node
        System.out.print("Reverse: ");
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DllBasic list = new DllBasic();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(10);
        list.display();
        list.displayRev();
    }
}
