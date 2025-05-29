public class JumpStatement {
    public static void main(String[] args) {
        /* for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i>5)
                {
                    break;
                }
                System.out.print(j+" ");
            }
            System.out.println();

        } */

        //! Continue
        for(int i=1;i<=10;i++)
        {
            if(i==4)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
