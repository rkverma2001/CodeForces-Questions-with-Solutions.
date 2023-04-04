import java.util.Scanner;

public class lights_out {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean[][] lights = new boolean[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                lights[i][j] = true;
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                int n = s.nextInt();
                if(n%2 == 1) {
                    lights[i][j] = !lights[i][j];
                    if(i>0) {
                        lights[i-1][j] = !lights[i-1][j];
                    }
                    if(i<2) {
                        lights[i+1][j] = !lights[i+1][j];
                    }
                    if(j>0) {
                        lights[i][j-1] = !lights[i][j-1];
                    }
                    if(j<2) {
                        lights[i][j+1] = !lights[i][j+1];
                    }
                }
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if(lights[i][j]) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        }
}
