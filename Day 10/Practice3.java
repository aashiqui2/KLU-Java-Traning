public class Practice3 {
    public static void main(String[] args) {
        String s="IV";
        System.out.println(romanToInt(s));
    }
    public static  int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int s1=value(s.charAt(i));
            if(i+1<s.length())
            {
                 int s2=value(s.charAt(i+1));
                 if(s1>=s2)
                 {
                    ans+=s1;
                 }
                 else{
                    ans-=s1;
                 }
            }else{
                ans=ans+s1;
            }
        }
        return ans;

    }
    public static int value(char c)
    {
        switch(c)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return -1;
    }
}
/* 
 I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
