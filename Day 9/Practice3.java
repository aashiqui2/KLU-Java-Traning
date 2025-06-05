public class Practice3 {
    public static void main(String[] args) {
        String s="4268";
        System.out.println(largestOddNumber(s));

    }
     public static String largestOddNumber(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if((s.charAt(i)-'0')%2!=0)
            {
                sb.append(s.substring(0,i+1));
                break;
            }
        }
        return sb.toString();
    }
}
