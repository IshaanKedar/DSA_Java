// Java Program for PriorityQueue
import java.util.PriorityQueue;

public class priorityqueue 
{
    public static void main(String[] args) 
    {
          // Priority Queue Min Type
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Add elements to the queue
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        // Print the head of the queue
        System.out.println("Head of Queue : " + p.peek());

    }
}