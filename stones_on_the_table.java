import java.util.Scanner;

public class stones_on_the_table {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int count = 0;
        for (int i=1; i<n; i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            count++;
        }
    }
    System.out.println(count);
    }
}
