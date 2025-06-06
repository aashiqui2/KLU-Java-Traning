public class Practice1 {

    public static void main(String[] args) {
        String s = "PROGRAM";
        int mid = s.length() / 2;// 3
        StringBuilder sb = new StringBuilder();
        for (int i = mid; i < s.length(); i++) {
            sb.append(s.charAt(i));
            System.out.println(sb);
        }
        for (int i = 0; i < mid; i++) {
            sb.append(s.charAt(i));
            System.out.println(sb);
        }
    }
}