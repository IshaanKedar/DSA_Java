import java.util.*;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read size of array
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Read array elements
        }
        int k = sc.nextInt(); // Read window size

        int[] result = new int[n - k + 1]; // Store max values
        int resultIndex = 0;

        Deque<Integer> q = new ArrayDeque<>(); // Use Deque instead of Queue

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of this window
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }

            // Remove elements smaller than the current one from the back
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }

            // Add current index
            q.offer(i);

            // Store max element of the window
            if (i >= k - 1) {
                result[resultIndex++] = a[q.peek()];
            }
        }

        // Print the result array after the loop
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
