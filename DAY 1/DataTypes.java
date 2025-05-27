public class DataTypes {
    public static void main(String[] args) {
        //! Type casting
        /* 1. narrow typecasting
        2. widining typecasting  */

        //! Narrow Type casting
        int a=129;
        byte b=(byte)a;
        System.out.println(b);

        int d=97;
        char c=(char)d;
        System.out.println(c);

        //! widening TypeCasting
        byte b1=127;
        int a1=b1;

        float f=3.17f;
        int f2=(int)f;
        System.out.println(f2);

        float f3=3.14f;

        double d1=f3;
        System.out.println(d1);

        //! variable y might not have been initialized
        // int y;
        // System.out.println(y);






    }
}
