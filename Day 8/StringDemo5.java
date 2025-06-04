public class StringDemo5 {
    public static void main(String[] args) {
        String s="(()())(())";
        int c=0;
        String res="";

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                c--;
            }
            if(c!=0)
            {
                res+=s.charAt(i);
            }
            if(s.charAt(i)=='(')
            {
                c++;
            }
        }
        System.out.println(res);
    }
}
