import java.util.Scanner;

public class queue_at_the_school {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        String str = s.next();
        char[] queue = str.toCharArray();
        for(int i=0; i<t; i++) {
            for(int j=0; j<n-1; j++) {
                if(queue[j]=='B' && queue[j+1]=='G') {
                    queue[j] = 'G';
                    queue[j+1] = 'B';
                    j++;
                }
            }
        } 
        System.out.println(new String(queue));
    }
}
