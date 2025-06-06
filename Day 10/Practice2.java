public class Practice2 {
    public static void main(String[] args) {
        int n=10000;
        int cnt=0;
        for(int i=999;i<=n;i++)
        {
            String s=String.valueOf(i);
            cnt=cnt+(s.length()-1)/3;
        }
        System.out.println(cnt);
    }
}
