package easiercodes;

import java.util.*;

public class stockspan {
    public static void stockSpan(int[] prices,int n) {
        for (int i = 0; i < n; i++) {
            int span = 1;

            int j = i - 1;
            while (j > 0 && prices[i] >= prices[j]) {
                span++;
                j--;
            }
            System.out.print(span + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        stockSpan(prices,n);
    }

    
}
