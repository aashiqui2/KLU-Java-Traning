public class MethodDemo {
    //! static block
    static{
        System.out.println("hello from static block");
    }
    //! non-static block
    {
        System.out.println("hi");
    }

     {
        System.out.println("welcome");
    }
    public static void main(String[] args) {
        MethodDemo md=new MethodDemo();
        MethodDemo md1=new MethodDemo();
    }
}
