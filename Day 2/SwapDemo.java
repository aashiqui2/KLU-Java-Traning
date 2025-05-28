public class SwapDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Before swap");
        System.out.println(a);
        System.out.println(b);

        /* 
        int temp=a;
        a=b;
        b=temp; */

       /*  a=a+b;
        b=a-b;
        a=a-b; */

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swap");
        System.out.println(a);
        System.out.println(b);
    }
}
