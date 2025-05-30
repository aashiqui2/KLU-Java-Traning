public class Demo13 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print(col + " ");
            }
            for (int col = 1; col < row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
