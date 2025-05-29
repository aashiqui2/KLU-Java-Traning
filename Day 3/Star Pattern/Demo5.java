import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            //! for printing space
            for(int space=1;space<=n-row;space++)
            {
                System.out.print(" ");
            }
            //! for printing star
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
    *
   **
  ***
 ****
*****
 */
