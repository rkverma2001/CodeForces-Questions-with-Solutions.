import java.util.Scanner;

public class Ultra_fast_mathematician {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        String str = "";
        for (int i=0; i<a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                str += "1";
            } else {
                str += "0";
            }
        }
        System.out.println(str);
    }
}
