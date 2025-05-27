public class TypesOfVariables {
    // ! instance variable
    int d = 20;// fields,instance variable,non-static variable

    //! static means common to all object.
    static float PI=3.14F;

    public static void main(String[] args) {
        // ! local variables
        {
            int a = 10;
            {
                int b = 20;
                {
                    int c = 30;
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                }
            }
        }
        // System.out.println(a);
        // syntax:
        // Classname referencename= new Classname();
        TypesOfVariables tfv = new TypesOfVariables();
        System.out.println(tfv.d);
        System.out.println(PI);
    }
}
