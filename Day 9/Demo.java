public class Demo {

    public static void main(String[] args) {
       /*  String s="hello";
        // s+=1;
        // s+=2;
        for(int i=1;i<4;i++)
        {
            s+=i;
            System.out.println(s);
        } */

        // StringBuffer sb=new StringBuffer();


        StringBuilder sb1=new StringBuilder("HELLO");
        sb1.reverse();
        System.out.println(sb1);
        sb1.append(" world");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("hello");
        sb2.deleteCharAt(2);
        System.out.println(sb2);
        sb2.delete(0, 2);
        System.out.println(sb2);

        sb2.replace(0, 2, "hello");
        System.out.println(sb2);

        sb2.insert(2, "l");
        System.out.println(sb2);


    }
}