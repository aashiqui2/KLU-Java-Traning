public class Demo11 {
    public static void main(String[] args) {
        int n = 5;
        // ! left part
        for (int row = 1; row <n*2 ; row++) {
            int totalcol = (row > n) ? 2 * n - row : row;
            for (int col = 1; col <= totalcol; col++) {
                System.out.print("*");
            }
            int spaceCol=(row<n)?n-row:n-totalcol;
            for(int space=1;space<=spaceCol;space++)
            {
                System.out.print(" ");
            }
            for(int space=1;space<=spaceCol;space++)
            {
                System.out.print(" ");
            }
             for (int col = 1; col <= totalcol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
