import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Boy_or_girl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Set<Character> distinct = new HashSet<>();
        for(char ch : str.toCharArray()) {
            distinct.add(ch);
        }

        int count = distinct.size();
        if(count%2 == 0) {
            System.out.println("CHAT WITH HER!");
        }

        else {
            System.out.println("IGNORE HIM!");
        }
    }
}
