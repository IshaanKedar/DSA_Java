package queue;

// Queue using array
public class Basic {
    static class Queue {
        int arr[];
        int size;
        int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // Enqueue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) { // Fix loop condition
                arr[i] = arr[i + 1];
            }
            rear--;  // Decrement rear after shifting
            return front;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);  // Fix: Pass size to constructor
        q.add(10);
        q.add(20);
        q.add(30);
        
        System.out.println(q.remove()); // 10
        System.out.println(q.peek());   // 20
    }
}
