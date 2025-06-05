import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s));
    }

    public static boolean isPanagram(String s) {
        s = s.toLowerCase();
        int hash[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                hash[s.charAt(i) - 'a']++;
            }

        }
        System.out.println(Arrays.toString(hash));
        for (int i = 0; i < 26; i++) {
            if (hash[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
