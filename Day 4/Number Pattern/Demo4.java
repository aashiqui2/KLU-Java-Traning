public class Demo4 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<row;space++)
            {
                System.out.print("  ");
            }
            for(int col=n;col>=row;col--)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
