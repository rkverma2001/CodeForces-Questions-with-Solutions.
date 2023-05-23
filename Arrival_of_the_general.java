import java.util.Scanner;

public class Arrival_of_the_general {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int mini = -1;

        int max = Integer.MIN_VALUE;
        int maxi = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] <= min) {
                min = arr[i];
                mini = i;
            }

            if (arr[i] > max) {
                max = arr[i];
                maxi = i;
            }
        }

        int ans = maxi - 1 + n - mini;

        if (maxi > mini) {
            System.out.println(ans - 1);
        }

        else {
            System.out.println(ans);
        }
    }
}
