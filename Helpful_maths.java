import java.util.*;
public class Helpful_maths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();
        String[] num = str.split("\\+");
        Arrays.sort(num);
        String newSum = String.join("+", num);
        System.out.println(newSum);
    }
}
