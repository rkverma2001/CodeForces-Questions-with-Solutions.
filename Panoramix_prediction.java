import java.util.Scanner;

public class Panoramix_prediction {

     public static boolean isPrime(int a) {
        if(a<=1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(a); i++) {
            if(a%i == 0){
                return false;
            }
        }
        return true;
     }

     public static int prime(int n) {
        int d = n+1;
        while(!isPrime(d)) {
            d++;
        }
        return d;
     }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int num1 = s.nextInt();
        if(prime(num) == num1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
     }
}
