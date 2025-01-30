package queue;

// Queue implementation using Linked List
public class queue_ll {
    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null; // Fix logical operator
        }

        // Enqueue operation
        public void add(int data) {
            Node newnode = new Node(data);
            if (tail == null) {
                tail = head = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        // Dequeue operation
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            if (head == null) {
                tail = null; // If queue is empty, reset tail
            }
            return front;
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // 10
        System.out.println(q.peek());   // 20
    }
}
