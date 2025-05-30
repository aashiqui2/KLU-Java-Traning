public class Demo1 {
    public static void main(String[] args) {
        int n = 1234;
        int cnt = 0;
    //! Brute force approach
        // while (n != 0) {
        //     n = n / 10;
        //     cnt++;
        // }
        // System.out.println(cnt);
        // ! Time complexity: O(n)

        //! Optimal approach
        System.out.println((int)Math.log10(n)+1);
    }
}
