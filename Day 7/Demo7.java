public class Demo7 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int res[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                res[j][i]=a[i][j];
            }
        }
        printArray(a);
        printArray(res);
    }
    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
