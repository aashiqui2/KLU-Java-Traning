public class Practice1 {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        if(n<0)
        {
            return false;
        }
        String num=String.valueOf(n);//"-121"
        StringBuilder sb=new StringBuilder(num);//-121
        return num.equals(sb.reverse().toString());
    }
}
