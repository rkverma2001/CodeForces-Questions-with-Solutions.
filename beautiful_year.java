import java.util.Scanner;

public class beautiful_year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int temp=0;
        int year = s.nextInt();
        while(true) {
            year++;
            temp = year;
            a = year%10;
            year = year/10;
            b = year%10;
            year = year/10;
            c = year%10;
            year = year/10;
            d = year%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
                System.out.println(temp);
                break;
            }
            year =temp;
        }
    }
}
