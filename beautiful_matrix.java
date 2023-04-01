import java.util.Scanner;

public class beautiful_matrix {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int x = 0, y = 0;
            for (int i = 1; i <= 5; i++) {
                String[] row = sc.nextLine().split(" ");
                if (rowContainsOne(row)) {
                    x = i;
                    y = getIndexOfOne(row) + 1;
                }
            }
    
            int moves = Math.abs(x - 3) + Math.abs(y - 3);
            System.out.println(moves);
        }
    
        private static boolean rowContainsOne(String[] row) {
            for (String s : row) {
                if (s.equals("1")) {
                    return true;
                }
            }
            return false;
        }
    
        private static int getIndexOfOne(String[] row) {
            for (int i = 0; i < row.length; i++) {
                if (row[i].equals("1")) {
                    return i;
                }
            }
            return -1;
        }
    }
    
