package easiercodes;

import java.util.*;

public class sortingwithoutextraspace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
   


