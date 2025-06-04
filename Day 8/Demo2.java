public class Demo2 {
    public static void main(String[] args) {
        int a[][] = { {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        //! brute force approach
        // int n = a.length;
        // int rotate[][] = new int[3][3];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         rotate[i][j]=a[n-j-1][i];
        //     }
        // }
        transpose(a);
        reverse(a);
        printArray(a);
        // printArray(rotate);
    }

    public static void transpose(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j <n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
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
