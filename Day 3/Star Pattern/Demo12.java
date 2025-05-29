public class Demo12 {
    public static void main(String[] args) {
        int n=5;
        int c=65;
        int t=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(t==0){
                    c=c+32;
                    System.out.print((char)(c)+" ");
                    c++;
                    t=1;
                }else{
                    c=c-32;
                    System.out.print((char)(c)+" ");
                    c=c+1;
                    t=0;
                }
            }
            System.out.println();
        }
    }
}
