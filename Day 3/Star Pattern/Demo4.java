import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<n*2;row++)
        {
            int totalCol=(row>n)?2*n-row:row;
            for(int col=1;col<=totalCol;col++)
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
****
***
**
*
 */
