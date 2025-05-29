public class Demo13 {
    public static void main(String[] args) {
        int n=5;
        char c='E';
        char t=c;
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
               System.out.print(t++ +" ");
            }
            c--;
            t=c;
            System.out.println();
        }
    }
}
