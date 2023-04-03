import java.util.Scanner;

public class borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                t += "0";
                i ++;
            } 
            else if (s.charAt(i) == '-' && s.charAt(i+1) == '.') {
                t += "1";
                i += 2;
            } 
            else if (s.charAt(i) == '-' && s.charAt(i+1) == '-') {
                t += "2";
                i += 2;
            }
        }
        System.out.println(t);
    }
}