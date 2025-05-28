public class DemoQ {
    public static void main(String[] args) {
        for(int row=0;row<6;row++){
            for(int col=0;col <6;col++){
                if(col==0 &&row!=5||col==4&&row!=5||row==4&&col!=5||row==0 &&col!=5||row==col&&row>1){
                    System.out.print("* ");
                }else{
                    System.out.print( "  ");
                }
            }
            System.out.println();
        }
    }
}
