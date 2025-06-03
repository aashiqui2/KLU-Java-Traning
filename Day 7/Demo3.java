public class Demo3 {
    public static void main(String[] args) {
        int a[] = { 3, 5, 4, 1, 2 };
        System.out.println(check(a));
    }

    public static boolean check(int a[]) {
        int n = a.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>a[(i+1)%n])
            {
                cnt++;
            }
        }
        return (cnt<=1)?true:false;
    }

}
