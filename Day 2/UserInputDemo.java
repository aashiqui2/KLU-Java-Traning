import java.util.Scanner;
public class UserInputDemo {
   public static void main(String[] args) {
    //   CLASSNAME REFERNCENAME= NEW CLASSNAME();
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();//camelcase
    System.out.println("The value of a is "+a);

    float f=sc.nextFloat();
    System.out.println("The value of f is "+f);

    double d=sc.nextDouble();
    System.out.println("The value of d is "+d);
      
     char c=sc.next().charAt(0);
     System.out.println("the character is "+c);
   } 
}
