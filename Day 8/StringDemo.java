public class StringDemo {
    public static void main(String[] args) {
        //! using new keyword
        String s1 = new String("hello");
        String s2 = new String("hello");
        //! using string literals
        // String s1 = "hello";
        // String s2 = "hello";
        /* if (s1 == s2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        } */
       if (s1.equals(s2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
