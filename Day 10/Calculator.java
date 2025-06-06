public class Calculator {
    int num=20;
    public static void main(String[] args) {
        int data=10;
        Calculator obj=new Calculator();
        Calculator obj1=new Calculator();
        System.out.println(obj.num);
        obj.num=30;
        System.out.println(obj.num);
        System.out.println(obj1.num);

        int result=obj.add(3,3);
        System.out.println(result);
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}