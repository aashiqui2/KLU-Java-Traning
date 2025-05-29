import java.util.Scanner;
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++)
        {
            for(int space=1;space<=row;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
