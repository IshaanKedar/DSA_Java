package easiercodes;

import java.util.*;


public class loopdetection {
    public static boolean hasloop(List<Integer> list) {
        Set<Integer> visited = new HashSet<>();
        for (int num : list) {
            if (visited.contains(num))
                return true;
            visited.add(num);
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(hasloop(list));
    }
}

