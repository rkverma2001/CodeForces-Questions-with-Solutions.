import java.util.Scanner;

public class Perfect_premutation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n % 2 == 1) {
            System.out.println(-1);
        }

        else {
            int[] permutation = new int[n];
            int i = 0;
            for (int j = 2; j <= n; j += 2) {
                permutation[i++] = j;
                permutation[i++] = j - 1;
            }

            for (int j = 0; j < permutation.length; j++) {
                System.out.println(permutation[j] + " ");
            }
        }
    }
}