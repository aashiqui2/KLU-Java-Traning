import java.util.Scanner;

public class Demo1 {
    //! brute Force approach
    public static boolean isPowerTwo(int n)
    {
        /* if(n==0)
        {
            return false;
        }
        while(n%2==0)
        {
            n=n/2;
        }
        return (n==1); */
        return (n != 0 && (n & (n - 1)) == 0);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();//16
        if(isPowerTwo(n))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
