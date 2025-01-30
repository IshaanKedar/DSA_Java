import java.util.*;


public class celebrity {

    static boolean knows(int a, int b, int[][] matrix) {
        return matrix[a][b] == 1;
    }
    
    static int findCelebrity(int n, int[][] matrix) {
        Stack<Integer> s = new Stack<>();
        int c; //celebrity

        for (int i = 0; i < n; i++) { //id all guests
            s.push(i);
        }

        while (s.size() > 1) {
            int A = s.pop();
            int B = s.pop();
            if (knows(A, B, matrix)) {
                s.push(B);
            } else {
                s.push(A);
            }
        }

        c = s.pop(); //potential candidate

        for (int i = 0; i < n; i++) {
            if ((i != c) && (!knows(i, c, matrix))) {
                return -1;
            }

        }
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //int[][] matrix = { { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } };
        int id = findCelebrity(n, matrix);
        if (id == -1) {
            System.out.println("no celebrity");
        }
        else {
            System.out.println("celebrity id " + id);
        }
                           
    }
}
