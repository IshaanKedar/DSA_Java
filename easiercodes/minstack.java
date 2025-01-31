package easiercodes;

import java.util.*;


public class minstack {
    private static Stack<Integer> mainStack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();

    void push(int n) {
        mainStack.push(n);
        if (minStack.empty() || minStack.peek() >= n)
            minStack.push(n);
    }

    int pop() {
        if (mainStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        return mainStack.pop();
    }
    public static void main(String[] args) {
        minstack MyStack = new minstack();
        MyStack.push(5);
        MyStack.push(2);
        MyStack.push(7);
        MyStack.push(1);
        System.out.println("Min: " + minStack.peek());
        MyStack.pop();
        System.out.println("Top: " + mainStack.peek());
        System.out.println("Min: " + minStack.peek());
    }
}
