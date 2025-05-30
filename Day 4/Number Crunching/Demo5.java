public class Demo5 {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
