import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println((double)(sum/n));
    }
}
