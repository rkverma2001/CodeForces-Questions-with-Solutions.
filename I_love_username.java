import java.util.Scanner;

public class I_love_username {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int best = arr[0];
        int worst = arr[0];
        int amazing = 0;
        for (int i = 1; i < n; i++) {
            if (best > arr[i]) {
                best = arr[i];
                amazing++;
            }

            if (worst < arr[i]) {
                worst = arr[i];
                amazing++;
            }
        }
        System.out.println(amazing);
    }
}
