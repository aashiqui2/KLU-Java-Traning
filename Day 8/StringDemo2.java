public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String a = "afd";
        String b = "acd";
        System.out.println(a.compareTo(b));
        // ! return positive s1>s2 ,return negative s1<s2,return o if s1==s2

        String c = "ABC";
        String d = "abc";
        System.out.println(c.compareToIgnoreCase(d));

        String str="the sky is blue";
        System.out.println(str.startsWith("e"));
        System.out.println(str.startsWith("ky",5));

        System.out.println(str.endsWith("lue"));

        String str1="java";
        System.out.println(str1.contentEquals("java"));

        String F="welcome to B.Tech CSE";
        System.out.println(F.contains("CSE"));
    }
    
}
