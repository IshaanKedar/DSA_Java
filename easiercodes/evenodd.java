package easiercodes;

import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        for (int num : list) {
            if (num % 2 == 0)
                System.out.print(num + " ");

        }
        for (int num : list) {
            if(num%2!=0)System.out.print(num+" ");
        }
    }
    
}
