import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //! using new keyword
        // int size=2147483647;
        // int a[]=new int[size];
        // System.out.println(a.length);
        // a[0]=1;
        //ArrayIndexOutOfBoundsException:
        // NegativeArraySizeException: -
        // OutOfMemoryError

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();

        int a[]=new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

    }
}
