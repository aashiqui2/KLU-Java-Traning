import java.util.Scanner;

public class IfelseIfDemo {
    public static void main(String[] args) {
        //if-elseif()

       /*  if(condition 1)
        {
            block 1;
        }
        else if(condition 2)
        {
            block 2;
        } */
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        /* if(a>b)
        {
            System.out.println("The value of a is greater ");
        }
        else{
            System.out.println("the value of b is greater");
        } */

        if(a>b &&a>c)System.out.println("A is greater");
        else if(b>a &&b>c)System.out.println("B is greater");
        else System.out.println("C is greater");
    }
}
