public class Practice2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        // String s="race a car";

        // amanaplanacanalpanama
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char start=s.charAt(i);
            char end=s.charAt(j);

            while (!Character.isLetterOrDigit(start)) {
                i++;
            }
            while (!Character.isLetterOrDigit(end)) {
                j--;
            }
            if (start !=end) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
