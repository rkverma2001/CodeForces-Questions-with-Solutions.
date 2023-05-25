import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            arr[i] = s.nextInt();
        }
        Set<Integer> uniqueColors = new HashSet<>();
        for (int color : arr) {
            uniqueColors.add(color);
        }
        System.out.println(4-uniqueColors.size());
    }
}
