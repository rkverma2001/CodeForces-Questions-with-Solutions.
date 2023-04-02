import java.util.Scanner;
public class we_need_the_zero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t --> 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = s.nextInt();
                }
                int ans = -1;
                for (int i=0; i<128; i++) {
                    int a = 0;
                    for (int j = 0; j < n; j++) {
                        a ^= (arr[j] ^ i);
                    }
                    if (a == 0) {
                        ans = i;
                        break;
                    }
                }
                System.out.println(ans);
        }
    }
}
