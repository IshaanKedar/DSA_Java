public class BitonicSort {

    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;

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
            node = node.next;
        }
        System.out.println("NULL");
    }

    public void bitonicsort() {
        if (head == null || head == tail) return; // Edge case: Empty list or single node

        Node left = head;
        Node right = tail;
        Node newHead = null;
        Node newTail = null;

        while (left != null && right != null && left != right && right.next != left) {
            Node nextNode;
            if (left.val < right.val) {
                nextNode = left;
                left = left.next;
            } else {
                nextNode = right;
                right = right.prev;
            }

            // If new list is empty, initialize it
            if (newHead == null) {
                newHead = nextNode;
                newTail = nextNode;
                newTail.prev = null;
            } else {
                newTail.next = nextNode;
                nextNode.prev = newTail;
                newTail = nextNode;
            }
        }

        // Ensure the last remaining element is included
        if (left != null) {
            newTail.next = left;
            left.prev = newTail;
        }

        tail = newTail;
        tail.next = null; // Mark end of list
        head = newHead;   // Update head to new sorted list
    }


    public static void main(String[] args) {
        BitonicSort list = new BitonicSort();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(5);
        list.insertLast(4);
        list.insertLast(3);
        
        list.display();
        list.bitonicsort();
        list.display();
    }
}
