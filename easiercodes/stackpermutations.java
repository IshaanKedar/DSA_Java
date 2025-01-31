package easiercodes;

import java.util.*;

public class stackpermutations {
    public static boolean check(int[] input, int[] output, int n) {
        int i = 0, j = 0;
        Stack<Integer> stack = new Stack<>();
        while (j < n) {
            if (stack.isEmpty() || stack.peek() != output[j]) {
                if (i == n)
                    return false;
                stack.push(input[i++]);

            } else {
                stack.pop();
                j++;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    int[] input = {1, 2, 3, 4, 5};
    int[] output = {4, 5, 3, 2, 1};
    System.out.println(check(input,output,5));
    }
    
}
