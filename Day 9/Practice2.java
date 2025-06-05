public class Practice2 {
    public static void main(String[] args) {
        // String s="A man, a plan, a canal: Panama";
        String s="race a car";

        // amanaplanacanalpanama
        System.out.println(isPalindrome(s));
    }
     public static  boolean isPalindrome(String s) {
        s=s.toLowerCase();
        if(s.length()<=1)
        {
            return true;
        }
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
           
            while(s.charAt(i)<'a'||s.charAt(i)>'z' &&i<j)
            {
                i++;
            }
            while(s.charAt(j)<'a' ||s.charAt(j)>'z'&& i<j)
            {
                j--;
            }
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
}
