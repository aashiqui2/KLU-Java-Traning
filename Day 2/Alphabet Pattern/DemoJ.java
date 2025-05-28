public class DemoJ {
    public static void main(String[] args) {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == 0 || col == 2 || row == 6 && col < 2 || col == 0 && row == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
