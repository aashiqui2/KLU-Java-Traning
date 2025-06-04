public class Demo2 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        //! brute force approach
        int n = a.length;
        int rotate[][] = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotate[i][j]=a[n-j-1][i];
            }
        }
        // transpose(a);
        // reverse(a);
        printArray(a);
        printArray(rotate);
    }

    public static void transpose(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                int temp = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = temp;
            }
        }
    }

    public static void reverse(int a[][]) {
        int n = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = temp;
            }
        }
    }

    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
