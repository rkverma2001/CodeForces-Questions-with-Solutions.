import java.util.Scanner;

public class Insomnia_cure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int l = s.nextInt();
        int m = s.nextInt();
        int n = s.nextInt();
        int d = s.nextInt();
        int count = 0;
        if (k == 1 || l == 1 || m == 1 || n == 1)
            System.out.println(d);
        else {
            for (int i = 1; i <= d; i++) {
                if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
