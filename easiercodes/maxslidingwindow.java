package easiercodes;

import java.util.*;

public class maxslidingwindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int win = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - win + 1; i++) {
            int max = arr[i];
            for (int j = 0; j < win; j++) {
                if (arr[i + j] > arr[i])
                    max = arr[i + j];
            }
            System.out.print(max+" ");
        }
    }
    
}
