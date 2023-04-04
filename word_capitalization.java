import java.util.Scanner;

public class word_capitalization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if (Character.isLowerCase(str.charAt(0))) {
            char ch = Character.toUpperCase(str.charAt(0));
            System.out.println(Character.toString(ch) + str.substring(1));
        } else {
            System.out.println(str);
        }
    }
}
