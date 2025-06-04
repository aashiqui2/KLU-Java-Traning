public class Demo3 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6}};
        int b[][]={{2,2},
                    {2,2},
                    {2,2}};
        int m=a.length;
        int n=a[0].length;
        int p=b[0].length;
        int res[][]=new int[m][p];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
               for(int k=0;k<n;k++)
               {
                  res[i][j]+=a[i][k]*b[k][j];
               }
            }
        }
        printArray(res);
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
