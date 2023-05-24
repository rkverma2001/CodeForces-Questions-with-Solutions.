import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        int res = 0;
        int[][] passengers = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                passengers[i][j] = s.nextInt();
            }
            res = res + passengers[i][1] - passengers[i][0];
            if (res > max)
                max = res;
        }
        System.out.println(max);
    }
}
