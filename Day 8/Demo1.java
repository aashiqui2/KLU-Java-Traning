public class Demo1 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1]=temp;
            }
        }
        printArray(a);
    }
    public static void printArray(int a[][])
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
