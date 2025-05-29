public class Demo9 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++)
        {
            for(int space=1;space<=row;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        //! lower part
        for(int row=2;row<=n;row++)
        {
            for(int space=1;space<=n-row;space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * * * * * 
 * * * * 
  * * * 
   * * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 */
