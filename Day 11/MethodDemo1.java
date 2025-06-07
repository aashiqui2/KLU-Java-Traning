public class MethodDemo1 {
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public void add(float a,float b)
    {
        System.out.println(a+b);
    }
    public void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MethodDemo1 md= new MethodDemo1();
        md.add(3, 4);
        md.add(3,2,1);
        md.add(3.5f,3.5f);
    }
}
