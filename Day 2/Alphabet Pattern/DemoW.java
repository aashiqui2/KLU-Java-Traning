public class DemoW {
    public static void main(String[] args) {
        for(int row=0;row<4;row++){
            for(int col=0;col <7;col++){
                if(col==0||col==6||col+row==3||row-col==-3){
                    System.out.print("* ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}
