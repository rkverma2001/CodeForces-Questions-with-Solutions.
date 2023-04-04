import java.util.Scanner;

public class insert_digit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int d = s.nextInt();
            String str = s.next();
            StringBuilder str1 = new StringBuilder(str);
            boolean bool = false;
            for(int i=0; i<n; i++) {
                if(str.charAt(i)-'0'<d) {
                    str1.insert(i, d);
                    bool = true;
                    break;
                }
            }
            if(!bool) str1.append(d);
            System.out.println(str1.toString());
        }
    }
}
