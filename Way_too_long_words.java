import java.util.Scanner;

public class Way_too_long_words {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = t+1;
        while(n-->0) {
            String str = s.nextLine();
            System.out.println(count(str));
        }
    } 

    public static String count(String str) {
        if(str.length() <= 10) {
            return str;
        }

        else {
            return str.charAt(0) + Integer.toString(str.length()-2) + str.charAt(str.length()-1);
        }
    }
}
