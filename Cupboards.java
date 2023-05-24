import java.util.Scanner;

public class Cupboards {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] cupboards = new int[n][2];
        int countl = 0;
        int countr = 0;
        int l1 = 0;
        int r1 = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<2; j++) {
                cupboards[i][j] = s.nextInt();
            }
            if(cupboards[i][0]==0) countl++;
            if(cupboards[i][1]==0) countr++;
        }

        l1 = n-countl;
        r1 = n-countr;
        System.out.println(Math.min(l1, countl) + Math.min(r1, countr));

    }
}
