import java.util.Arrays;

public class ArrayDemo {
    int a=20;//non-static variable
    public void display()
    {
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        // ArrayDemo ad=new ArrayDemo();
        // ad.display();
        // System.out.println(ad.a);

        int[] a={1,2,3,4};
        System.out.println(a.length);
        System.out.println(a);//[I@372f7a8d

        //! bi-directional loop
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //! foreach- unidirectional loop
        for(int val:a)
        {
            System.out.print(val);
        }

        System.out.println(Arrays.toString(a));
    }
}
