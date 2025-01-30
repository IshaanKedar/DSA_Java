public class mergesort {
    Node head;
    Node tail;

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

    public void insert(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
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
    
    


    public static void main(String[] args) {
        mergesort MergeSort = new mergesort();
        MergeSort.insert(1);
        MergeSort.insert(2);
        MergeSort.display();
    }
    
}
