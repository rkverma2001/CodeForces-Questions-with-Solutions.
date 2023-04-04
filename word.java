import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = str.length();
        int upperCount = 0;
        int lowerCount = 0;
        for (int i=0; i<n; i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                upperCount++;
            } else{
                lowerCount++;
            }
        }
        if(upperCount <= lowerCount){
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str.toUpperCase());
        }
    }
}
