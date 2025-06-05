public class StringBui8lderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.hashCode());
        sb.append(" world");
        System.out.println(sb.hashCode());

        String s=new String("hello");
        System.out.println(s.hashCode());
        s+=" world";
        System.out.println(s.hashCode());
    }
}
