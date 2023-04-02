import java.util.Scanner;

public class borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.substring(i, i+2).equals("-.")) {
                t += "0";
                i += 2;
            } else if (s.substring(i, i+2).equals("--")) {
                t += "2";
                i += 2;
            } else if (s.charAt(i) == '-') {
                t += "1";
                i++;
            }
        }
        System.out.println(t);
    }
}