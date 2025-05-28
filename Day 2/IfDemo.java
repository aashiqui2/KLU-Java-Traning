import java.util.Scanner;

public class IfDemo {

    public static void main(String[] args) {
        /* 
          if(condition)
          {
            //block of code
          }
         */
        int a=5;
        if(a<10)
        {
            System.out.println("Hello");
        }
        //! even or odd
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        /* if(b%2==0){
          System.out.println("even");
        } */
       if((b&1)==0){
        System.out.println("even");
       }
    }
}