import java.util.Scanner;
public class IfelseDemo {

    public static void main(String[] args) {
        // ! If-else

/*         if(condition)
        {
        true block;
        }
        else{
        false block;
        } */
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        if ((b & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
    }
}