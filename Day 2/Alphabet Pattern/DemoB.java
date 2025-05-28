public class DemoB {

    public static void main(String[] args) {
        for(int row=0;row<7;row++)
        {
            for(int col=0;col<5;col++)
            {
                if(col==0||row==0&&col!=4||row==3&&col!=4||row==6&&col!=4||col==4 &&row!=0 &&row!=3&&row!=6)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}