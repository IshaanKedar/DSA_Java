import java.util.*;


public class minstack {
    Stack<Integer> s;
    Integer minele;

    minstack() {
        s = new Stack<Integer>();
    }

    void getmin() {
        if (s.isEmpty())
            System.out.println("stack empty");

        else {
            System.out.println("min element is" + minele);
        }
    }

    void peek() {
        if (s.isEmpty()) {
            System.out.println("empty");
            return;
        }
        Integer t = s.peek(); //top element

        System.out.println("top element is");

        if (t < minele) {
            System.out.println(minele);
        } else {
            System.out.println(t);
        }
    }

    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        // Minimum will change as the minimum element
        // of the stack is being removed.
        if (t < minele) {
            System.out.println(minele);
            minele = 2 * minele - t;
        }

        else
            System.out.println(t);
    }

    void push(Integer x) {
        if (s.isEmpty()) {
            minele = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        // If new number is less than original minEle
        if (x < minele) {
            s.push(2 * x - minele);
            minele = x;
        }

        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }

    public static void main(String[] args) {
        minstack s = new minstack();
       
          // Function calls
        s.push(3);
        s.push(5);
        s.getmin();
        s.push(2);
        s.push(1);
        s.getmin();
        s.pop();
        s.getmin();
        s.pop();
        s.peek();
    }
}


