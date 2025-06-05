public class Practice2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
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

            while (!Character.isLetterOrDigit(s.charAt(i))&&i<j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j))&&i<j) {
                j--;
            }
            if (s.charAt(i) !=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
