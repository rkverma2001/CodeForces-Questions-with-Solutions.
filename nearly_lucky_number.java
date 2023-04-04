import java.util.Scanner;

public class nearly_lucky_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int a = 0;
        while(n != 0) {
            long digit = n%10;
            if(digit == 7 || digit == 4) {
                a++;
            }
            n=n/10;
        }
        if(a==7 || a==4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
