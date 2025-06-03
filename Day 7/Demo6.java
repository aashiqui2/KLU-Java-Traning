import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        /* int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        } */

        Scanner sc = new Scanner(System.in);
        /* int b[][] = new int[3][3];
         for (int i = 0; i < b.length; i++) {
            for(int j=0;j<b[i].length;j++)
            {
               b[i][j]=sc.nextInt();
            }         
        } 
           printArray(b);
        */ 
      //! jagged aray
        int c[][]=new int[3][];
        c[0]=new int[3];
        c[1]=new int[2];
        c[2]=new int[1];
         for (int i = 0; i < c.length; i++) {
            for(int j=0;j<c[i].length;j++)
            {
               c[i][j]=sc.nextInt();
            }
        } 
          printArray(c);

    }

    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
