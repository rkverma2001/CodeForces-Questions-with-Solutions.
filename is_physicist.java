import java.util.Scanner;

public class is_physicist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] forces = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                forces[i][j] = s.nextInt();
            }
        }

        int sum_x = 0, sum_y = 0, sum_z = 0;
        for (int[] force : forces) {
            sum_x += force[0];
            sum_y += force[1];
            sum_z += force[2];
        }

        if (sum_x == 0 && sum_y == 0 && sum_z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
