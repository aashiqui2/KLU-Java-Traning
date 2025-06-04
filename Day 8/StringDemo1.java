public class StringDemo1 {
    public static void main(String[] args) {
        String s="hello";
        System.out.println(s.length());

        String s1="";
        System.out.println(s1.isBlank());
        //? it return true when string has whitespace and length is zero otherwise false.

        String s2="";
        System.out.println(s2.isEmpty());
    }
}
