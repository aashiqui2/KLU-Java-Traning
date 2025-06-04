import java.util.Arrays;

public class StringDemo3 {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf('e',8));

        System.out.println(s.lastIndexOf('e'));

        String a="welcome";
        System.out.println(a.substring(0));
        System.out.println(a.substring(0,1));
        // System.out.println(a.substring(20));
        // StringIndexOutOfBoundsException
        String s1="welcome";
        System.out.println(s1.charAt(5));

        String q="ABC";
        System.out.println(q.toLowerCase());
        System.out.println(q);

        String w="abc";
        System.out.println(w.toUpperCase());
        System.out.println(w);

        String r="    hello   world    ";
        System.out.println(r.trim());
        System.out.println(r);

        String sentence="Don't talk ";
        System.out.println(sentence.repeat(4));
        System.out.println(sentence);

        String t="hello wolrd";
        System.out.println(t.indent(5));

        String g="hello";//['h','e','l','l','o'];
        char arr[]=g.toCharArray();
        System.out.println(Arrays.toString(arr));

        String c=new String(arr);
        System.out.println(c);

    }
}
 